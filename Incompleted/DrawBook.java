/*https://www.hackerrank.com/challenges/drawing-book/problem*/

import java.util.*;
import java.io.*;

public class Solution {
    
    static int pageCount(int n, int p) {
        
        int diffPage = 0;
        int fromFront = n - p;
        int fromEnd = p - 1;
        boolean flag = true;
        
        if(fromFront < fromEnd){
            diffPage = fromFront;
        }else if(fromFront > fromEnd){
            diffPage = fromEnd;
            flag = false;
        }else{
            return p / 2;
        }
        
        if(flag){
            
        }
        
        if(diffPage == 1){
            
        }
        
        return page;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
    	
      /*"You have to fill in your login username in USERNAME below description"*/
    	String path = "/home/USERNAME/trainjava/result.txt";
    	
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int result = pageCount(n, p);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
