import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String isBalanced(String s) {
        int length = s.length();
        if(length % 2 != 0) return "NO";
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i = 0; i < length; i++){
            char target = s.charAt(i);
            switch(target){
            case ')':
                if(stack.isEmpty()) return "NO";
                if(stack.pop() != '(') return "NO";
                break;
            case '}':
                if(stack.isEmpty()) return "NO";
                if(stack.pop() != '{') return "NO";
                break;
            case ']':
                if(stack.isEmpty()) return "NO";
                if(stack.pop() != '[') return "NO";
                break;
            default:
                stack.push(target);
            }
        }
        if(stack.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
    }

    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        scanner.close();
    }
}
