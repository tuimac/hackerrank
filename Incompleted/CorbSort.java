import java.util.*;

public class Solution {

    static String[] bigSorting(String[] arr) {
        int[] array = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            array[i] = Integer.parseInt(arr[i]);
        }
        int gap = array.length;
        while(true){
            gap = (int)(gap / 1.3);
            if(gap > 1){
                for(int i = 0; i + gap < array.length; i++){
                    int tmp = 0;
                    if(array[i] > array[i + gap]){
                        tmp = array[i + gap];
                        array[i + gap] = array[i];
                        array[i] = tmp;
                    }
                }
            }else{
                for(int i = 0; i < array.length; i++){
                    arr[i] = String.valueOf(array[i]);
                }
                return arr;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
