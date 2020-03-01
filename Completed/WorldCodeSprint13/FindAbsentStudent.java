import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the findTheAbsentStudents function below.
    static int[] findTheAbsentStudents(int n, int[] a) {
        int[] map = new int[100];
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < a.length; i++){
            set.add(a[i]);
            map[a[i] - 1]++;
        }
        int[] answer = new int[n - set.size()];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(map[i] == 0){
                answer[count] = i + 1;
                count++;
            }
        }
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = findTheAbsentStudents(n, a);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
