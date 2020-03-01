import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RedKnight {
    
    List<Integer[]> list = new ArrayList<Integer[]>();

    static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
        String d = offSet(int i_start, int j_start, int i_end, int j_end);
        if(Math.abs(i_end - i_start) + 1 % 2 == 0){
            System.out.println("Impossible");
            return;
        }
        boolean isLeap = false;
        int counter = 0;
        if(Math.abs(j_end - j_start) % 2 == 0) counter = Math.abs(j_end - j_start) / 2;
        else{
            counter = Math.abs(j_end - j_start) / 2;
            isLeap = true;
        }
        System.out.println(isLeap == true ? counter + 1 : counter);
        while(Math.abs(j_end - j_start) != 0){
            
            
            System.out.print(location(d) + "");
        }
    }
    static String location(String d){
        String[] direction = {}
    }
    
    static String offSet(int i_start, int j_start, int i_end, int j_end){
        return String.valueOf(judge(i_start, i_end)) + String.valueOf(judge(j_start, j_end));
    }
    
    static int judge(int start, int end){
        if(start > end){
            return 2;
        }else if(start < end){
            return 1;
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i_start = in.nextInt();
        int j_start = in.nextInt();
        int i_end = in.nextInt();
        int j_end = in.nextInt();
        printShortestPath(n, i_start, j_start, i_end, j_end);
        in.close();
    }
}
