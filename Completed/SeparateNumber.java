import java.util.*;

public class SeparateNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(isExist(s));
        }
        in.close();
    }
    
    static String isExist(String s){
        for(int i = 0; i < s.length() / 2; i++){
            String num = s.substring(0, i + 1);
            long next = Long.parseLong(num) + 1;
            String total = num;
            while(s.length() - total.length() >= String.valueOf(next).length()){
                String nextStr = s.substring(total.length(), String.valueOf(next).length() + total.length());
                if(Long.parseLong(nextStr) != next){
                    break;
                }
                next++;
                total = total + nextStr;
                if(total.length() == s.length()) {
                	return "YES" +  " " + num;
                }
            }
        }
        return "NO";
    }
}
