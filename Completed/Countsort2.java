/*2018/4/1 20min
******************************************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Countsort2 {

    static int[] countingSort(int[] arr) {
        int[] counts = new int[100];
        for(int i = 0; i < counts.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(i == arr[j]) count++;
            }
            counts[i] = count;
        }
        int countNum = 0;
        for(int i = 0; i < counts.length; i++){
            if(counts[i] != 0){
                for(int j = 0; j < counts[i]; j++) {
                    arr[countNum] = i;
                    countNum++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");
        in.close();
    }
}
