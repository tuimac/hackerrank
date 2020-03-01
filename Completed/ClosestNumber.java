import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumber {

    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length - 1; i++){
            int diff = Math.abs(arr[i + 1] - arr[i]);
            if(diff <= min){
                min = diff;
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i + 1] - arr[i] == min){
                list.add(arr[i]);
                list.add(arr[i + 1]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
