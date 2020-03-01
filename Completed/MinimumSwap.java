import java.util.*;

public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int count = 0;
        int[] sorted = new int[arr.length];
        for(int i = 0; i < arr.length; i++) sorted[i] = arr[i];
        Arrays.sort(sorted);
        boolean flag = false;
        
        while(!flag){
            flag = true;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != sorted[i]){
                    int index = Arrays.binarySearch(sorted, arr[i]);
                    int tmp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = tmp;
                    count++;
                    flag = false;
                    break;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
