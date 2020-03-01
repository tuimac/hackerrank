2018/03/21

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortPt1 {

    static void insertionSort1(int n, int[] arr) {
        int last = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(arr[i] < last){
                arr[i + 1] = last;
                printArr(arr);
                return;
            }else{
                arr[i + 1] = arr[i];
                printArr(arr);
            }
        }
        arr[0] = last;
        printArr(arr);
    }
    
    static void printArr(int[] arr){
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
        insertionSort1(n, arr);
        in.close();
    }
}
