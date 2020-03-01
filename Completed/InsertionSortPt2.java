/*2018/03/21*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPt2 {

    static void insertionSort2(int n, int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] > arr[i]){
                int base = arr[i];
                for(int j = i - 1; j >= 0; j--){
                    if(arr[j] < base){
                        arr[j + 1] = base;
                        break;
                    }else{
                    	arr[j + 1] = arr[j];
                        if(j == 0){
                            arr[j] = base;
                            continue;
                        }
                    }
                }
            }
            print(arr);
        }
    }
    
    static void print(int[] arr){
        for(int a : arr){
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}
