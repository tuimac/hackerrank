import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        for(int i = 0; i < d; i++) queue.add(expenditure[i]);
        int median = 0;
        int max = 0;
        
        for(int i = d; i < expenditure.length; i++){
            median = median(queue, d);
            if(median > max) max = median;
            queue.remove();
            queue.add(expenditure[i]);
        }
        return max;
    }
    
    static int median(Queue<Integer> queue, int d){
        int[] index = new int[queue.size()];
        for(int i = 0; i < d; i++) index[queue.remove()]++;
        int indexsum = 0;
        int result = 0;
        
        if(queue.size() % 2 == 1){
            int i = 0;
            int second = d / 2;
            int first = second - 1;
            
            for(; i < d; i++){
                if(indexsum >= first){
                    first = i;
                    break;
                }
                indexsum += index[i];
            }
            for(; i < d; i++){
                if(indexsum >= second){
                    second = i;
                    break;
                }
                indexsum += index[i];
            }
            result = (first + second) / 2;
        }else{
            for(int i = 0; i < d; i++){
                if(indexsum >= d / 2){
                    result = indexsum;
                    break;
                }
                indexsum += index[i];
            }
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in) ;

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
