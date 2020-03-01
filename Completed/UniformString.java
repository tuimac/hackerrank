import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UniformString {
    
    static int[] map = new int[word.length];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char[] word = s.toCharArray();
        for(int i = 0; i < word.length; i++){
            map[i] = word[i] - 'a' + 1;
        }
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            System.out.pritnln(isExist(x));
        }
    }
    
    static String isExist(int x){
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int a : map){
            map.compute((char) a + 97, (key, old) -> map.contains(key) ? old++ : old = 0);
            if(a == x){
                return "YES";
            }
            if(map.get((char) (x + 97)) > 0){
                if(x % a == 0 && x / a < map.get((char) (x + 97))){
                    
                }
            }
        }   
    }
}
