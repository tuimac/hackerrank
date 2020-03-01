import java.util.*;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
    	Set<Integer> set = new HashSet<Integer>();
        int lcm = a[0];
        for(int i = 1; i < a.length; i++){
            lcm = lcm(lcm, a[i]);
        }
        int gcd = b[0];
        for(int i = 1; i < b.length; i++){
            gcd = gcd(gcd, b[i]);
        }
        int fixedLcm = lcm;
        while(b[0] > lcm){
            for(int i = 0; i < b.length; i++){
                if(b[i] % lcm != 0) break;
                if(i == b.length - 1) set.add(lcm);
            }
            lcm += fixedLcm;
        }
        for(int i = 0; i < a.length; i++){
            if(gcd % a[i] != 0) break;
            if(i == a.length - 1) set.add(gcd);
        }
        return set.size();
    }
    
    static int lcm(int x, int y) {
    	return gcd(x, y) * (x / gcd(x, y)) * (y / gcd(x, y));
    }
	
	static int gcd(int x, int y) {
    	while(y != 0){
            if(x > y && y != 0) {
                int tmp = x;
                x = y;
                y = tmp;
            }
            y = y % x;
        }
        return x;
    }
    
    static int sumArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        if(sumArray(a) > sumArray(b)){
            System.out.println(0);
            return;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
