/*20180503*/
/*I couldn't figure out why this code worked good by switching return value int to long.*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int[] tree;

    static long insertionSort(int[] arr) {
        long count = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            count += getCount(arr[i] - 1);
            updateTree(arr[i]);
        }
        return count;
    }
    
    static int getCount(int index){
        int count = 0;
        while(index > 0){
            count += tree[index];
            index -= index & (-index);
        }
        return count;
    }
    
    static void updateTree(int index){
        while(index < tree.length){
            tree[index]++;
            index += index & (-index);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            tree = new int[10000001];
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = insertionSort(arr);
            System.out.println(result);
        }
        in.close();
    }
}

/*******************************************************************/
/*latest solution*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int[] tree = new int[1000001];

    static long insertionSort(int[] arr) {
        long count = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            count += getCount(arr[i] - 1);
            updateTree(arr[i]);
        }
        return count;
    }
    
    static long getCount(int index){
        long count = 0;
        while(index > 0){
            count += tree[index];
            index -= index & (-index);
        }
        return count;
    }
    
    static void updateTree(int index){
        while(index < tree.length){
            tree[index]++;
            index += index & (-index);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            long result = insertionSort(arr);
            System.out.println(result);
        }
        in.close();
    }
}

/*******************************************************************/
/*yes, timeout...*/
/*maybe here is the answer....
https://www.geeksforgeeks.org/count-inversions-array-set-3-using-bit/*/
/*here is bit solution
https://www.topcoder.com/community/data-science/data-science-tutorials/binary-indexed-trees/*/

    static int insertionSort(int[] arr) {
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            for(int j = i - 1; j >= 0; j--){
                if(arr[i] < arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
/*******************************************************************/
/*20180430 get throgh half testcases*/
/*https://www.hackerrank.com/challenges/insertion-sort/problem*/
/*most causes of the problems are timeout*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSortAdvanced {

    static int insertionSort(int[] arr) {
        int count =  0;
        for(int i = 1; i < arr.length; i++){
            int tmp = arr[i];
            int j = i - 1;
            while(j >= 0 && tmp < arr[j]){
                arr[j + 1] = arr[j];
                j--;
                count++;
            }
            arr[j + 1] = tmp;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = insertionSort(arr);
            System.out.println(result);
        }
        in.close();
    }
}
