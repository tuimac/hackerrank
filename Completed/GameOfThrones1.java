import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones1 {

    static String gameOfThrones(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            int count = 0;
            for(int i = 0; i < arr.length - 1; i++){
                count++;
                if(arr[i] != arr[i + 1]){
                    if(count % 2 != 0) return "NO";
                    else count = 0;
                }
            }
            return "YES";
        }else{
            int count = 0;
            boolean oddNum = false;
            for(int i = 0; i < arr.length - 1; i++){
                count++;
                if(arr[i] != arr[i + 1]){
                    if(arr[i] != arr[i + 1]){
                        if(count % 2 != 0 && oddNum == true) return "NO";
                        else if(count % 2 != 0 && oddNum == false) oddNum = true;
                        else count = 0;
                    }
                }
            }
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
