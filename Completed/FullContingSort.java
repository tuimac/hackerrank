import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FullContingSort {

    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer[] sb = new StringBuffer[100];
        int n = Integer.parseInt(in.readLine());
        int half = n % 2 == 1 ? n / 2 + 1 : n / 2;
        
        for(int i = 0; i < n; i++){
            String[] x = in.readLine().split("\\s", -1);
            if(i < half){
                int index = Integer.parseInt(x[0]);
                if(sb[index] == null) sb[index] = new StringBuffer();
                sb[index].append("- ");
            }else{
                int index = Integer.parseInt(x[0]);
                if(sb[index] == null) sb[index] = new StringBuffer();
                sb[index].append(x[1] + " ");
            }
        }
        for(int i = 0; i < 100; i++){
            if(sb[i] != null) System.out.print(sb[i]);
        }
    }
}
