import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    static int anagram(String s){
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        if(s.length() % 2 != 0){
            return -1;
        }
        for(int i = 0,j = s.length() / 2; i < s.length() / 2; i++, j++){
            s1[s.charAt(i) - 'a']++;
            s2[s.charAt(j) - 'a']++;
        }
        int answer = 0;
        for(int i = 0; i < 26; i++){
            answer += Math.abs(s1[i] - s2[i]);
        }
        return answer / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}

