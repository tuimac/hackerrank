import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {
        
        int length = s.length();
        int count = 0;
        
        for(int i = 1; i < length; i++){
            for(int j = 0; j < length - i; j++){
                char[] a = s.substring(j, j + i).toCharArray();
                for(int k = j + 1; k <= length - i; k++){
                    char[] b = s.substring(k, k + i).toCharArray();
                    if(isAnagram(a, b)){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    static boolean isAnagram(char[] a, char[] b){
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int ansa = 1;
        int ansb = 1;
        
        for(int i = 0; i < a.length; i++){
            int tmpa = prime[a[i] - 'a'];
            int tmpb = prime[b[i] - 'a'];
            
            ansa *= tmpa;
            ansb *= tmpb;
            
        }
        
        if(ansa == ansb) return true;
        else return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
