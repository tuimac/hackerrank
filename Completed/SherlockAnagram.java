import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SherlockAnagram {
    static int sherlockAndAnagrams(String s) {
        int freq = 0;
        int[] prime_number = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int length = s.length();
        for(int i = 1; i < length; i++){
            for(int j = 0; j < length - i + 1; j++){
                long base = prime_number[s.charAt(j) - 97];
                for(int k = j + 1; k < j + i; k++) base *= prime_number[s.charAt(k) - 97];
                for(int k = j + 1; k < length - i + 1; k++){
                    long target = prime_number[s.charAt(k) - 97];
                    for(int l = k + 1; l < k + i; l++) target *= prime_number[s.charAt(l) - 97];
                    if(base == target) freq++;
                }
            }
        }
        return freq;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();
            int result = sherlockAndAnagrams(s);
        }
        scanner.close();
    }
}
