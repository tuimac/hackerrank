import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String richieRich(String s, int n, int k){
        int edge = s.length() - 1;
        boolean isPalindrome = false;
        char[] array = s.toCharArray();
        for(int i = 0; i <= s.length() / 2; i++){
            int diff = array[i] - array[edge - i];
            if(diff != 0 && i != edge - i) {
                if(diff > 0) array[edge - i] = array[i];
                else array[i] = array[edge - i];
                if(--k <= 0) return "-1";
            }
        }
        isPalindrome = checkPalindrome(array);
        if(isPalindrome == true) return String.valueOf(array);
        else{
            int rest = (k % 2 == 0 ? k / 2 : 
            for(int i = 0; i <= ; i++){
                
            }
            
        }
        
    }
    
    static boolean checkPalindrome(char[] array){
        for(int i = 0; i <= array.length / 2; i++){
            if(array[i] != array[array.length - 1 - i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}


/*The way of solving this problem is making code for modifying the number
string as Palindromes.

**************************************************************************
20180203's code down below↓*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String richieRich(String s, int n, int k){
        int edge = s.length() - 1;
        char[] array = s.toCharArray();
        int count = 0;
        for(int i = 0; i < s.length() / 2; i++){
            if(array[i] != array[edge - 1]) count++;
        }
        for(int i = 0; i < s.length() / 2; i++){
            if(k - count > 1){
                array[edge - i] = '9';
                array[i] = '9';
                k-=2;
                count--;
            }else if(k - count == 1){
                int diff = array[i] - array[edge - i];
                if(diff > 0) array[edge - i] = array[i];
                else array[i] = array[edge - i];
                return String.valueOf(array);
            }else if(k - count < 0 && k > 0){
                for(int j = 0; j < s.length() / 2; j++){
                    array[edge - i] = '9';
                    array[i] = '9';
                    k -= 2;
                    if(k < 2){
                        break;
                    }
                }
            }
        }
        if(isPalindrome(array) == false){
            return "-1";
        }else{
            return String.valueOf(array);
        }
    }
    
    static boolean isPalindrome(char[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] != array[array.length - 1 - i]) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        System.out.println(result);
    }
}
