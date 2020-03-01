import java.util.*;

public class SherlockValidStirng {

    static String isValid(String s){
        Set<Character> set = new HashSet<Character>();
        int[] alphabet = new int[26];
        for(int i = 0; i < s.length(); i++) {
        	set.add(s.charAt(i));
        	alphabet[s.charAt(i) - 'a']++;
        }
        int freq = 0;
        boolean isOnce = true;
        for(int i = 0; i < 26; i++) {
        	if(alphabet[i] == 0) continue;
        	if(freq != alphabet[i]){
        		if(freq == 0) {
        			freq = alphabet[i];
        			continue;
        		}
        		if(freq != alphabet[i] && isOnce == false) return "NO";
        		else if(Math.abs(freq - alphabet[i]) == 1 || alphabet[i] == 1) isOnce = false;
        		else if(Math.abs(freq - alphabet[i]) > 1) return "NO";
        	}
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        String result = isValid(s);
        System.out.println(result);
    }
}
