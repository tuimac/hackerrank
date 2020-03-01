/*https://www.hackerrank.com/challenges/candies/problem*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the candies function below.
    static long candies(int n, int[] arr) {
        long[] answer = new long[n];
        initialize(answer);

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]) {
                answer[i] = answer[i - 1] + 1;
            }else if(arr[i] < arr[i - 1]){
                i = backtracking(i - 1, arr, answer);
            }
        }
        return sumUp(answer);
    }
    
    static int backtracking(int index, int[] arr, long[] answer){
        int sum = 0;
        int oriIndex = index;
        
        for(int i = index; i < arr.length - 1; i++){
            if(arr[i] <= arr[i + 1]) break;
            sum++;
        }
        
        index += sum;
        
        for(int i = index - 1; i >= oriIndex; i--){
            if(i == oriIndex){
                if(answer[i] > (answer[i + 1] + 1)) break;
            }
            answer[i] = answer[i + 1] + 1;
            index++;
        }
        return oriIndex + sum;
    }

    static void initialize(long[] answer){
        for(int i = 0; i < answer.length; i++){
            answer[i] = 1;
        }
    }

    static long sumUp(long[] answer){
        long sum = 0;
        for(long x : answer){
            sum += x;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            arr[i] = arrItem;
        }

        long result = candies(n, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
