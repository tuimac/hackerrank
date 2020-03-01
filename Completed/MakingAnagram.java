import java.util.*;

public class MakingAnagram {
	
    static int makingAnagrams(String s1, String s2){
        int count = 0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i = 0; i < s1.length(); i++) arr1[s1.charAt(i) - 97]++;
        for(int i = 0; i < s2.length(); i++) arr2[s2.charAt(i) - 97]++;
        for(int i = 0; i < 26; i++) count += Math.abs(arr1[i] - arr2[i]);
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        in.close();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
