import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        in.close();
        char[][] alpha = new char[26][26];
        int[][] numbers = new int[26][26];
        char[] words = s.toCharArray();
        if(words.length < 2){
            System.out.println(0);
            return;
        }
        
        for(int i = 0; i < len; i++){
            int index = (int)(words[i] - 'a');
            for(int j = 0; j < 26; j++){
                if(alpha[index][j] != words[i] && numbers[index][j] != -1){
                    numbers[index][j]++;
                    alpha[index][j] = words[i];
                }else{
                    numbers[index][j] = -1;
                }
            }
            for(int j = 0; j < 26; j++){
                if(alpha[j][index] != words[i] && numbers[j][index] != -1){
                    numbers[j][index]++;
                    alpha[j][index] = words[i];
                }else{
                    numbers[j][index] = -1;
                }
            }
        }
        int max = 0;
        for(int i = 0; i < 26; i++){
            for(int j = 0; j < 26; j++){
                if(numbers[i][j] > max){
                    max = numbers[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
