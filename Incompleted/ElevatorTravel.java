import java.util.*;

class Result {
    
    private static int leftIndex;
    private static int rightIndex;

    public static int solve(int[] array) {
        int half = array.length / 2;
        
        findIndex(array, 0, array.length - 1, half);
    }
    
    private static void findIndex(int[] array, int left, int right, int half){
        while(left <= right){
            while(array[left] )
        }
    }
        
    private static void swap(int[] array, int a, int b){
        int tmp = 0;
        tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}

public class Solution {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = in.nextInt();
        in.close();
        
        System.out.println(Result.solve(array));
    }
}

/********************************************************************************************/

import java.util.*;

class Result {

    public static int solve(int[] array) {
        int max = 0;
        int maxindex = 0;
        int[] diff = new int[array.length];
        int ans = 0;
        
        for(int i = 0; i < diff.length; i++){
            int x = array[i] - i;
            if(max < x){
                max = x;
                maxindex = i;
            }
        }
        
        int swapindex = 0;
        int target = maxindex + 1;
        
        for(int i = 0; i < array.length; i++){
            if(target == array[i]){
                swapindex = i;
                break;
            }
        }
        
        swap(array, maxindex, swapindex);
        
        int prenum = 0;
        
        for(int i = 0; i < array.length; i++){
            ans += Math.abs(array[i] - prenum);
            prenum = array[i];
        }
        
        return ans;
    }
    
    private static void swap(int[] array, int a, int b){
        int tmp = 0;
        tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }

}

public class Solution {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++) array[i] = in.nextInt();
        in.close();
        
        System.out.println(Result.solve(array));
    }
}
