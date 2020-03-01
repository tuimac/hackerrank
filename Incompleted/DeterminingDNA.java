/*https://www.hackerrank.com/challenges/determining-dna-health/problem*/

import java.util.*;

public class Solution {
    
    static String[] genes;
    static int[] health;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        genes = new String[n];
        for(int genes_i=0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
        }
        health = new int[n];
        for(int health_i=0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s = in.nextInt();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int a0 = 0; a0 < s; a0++){
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();
            int total = 0;
            for(int i = first; i <= last; i++){
                total += totalHealth(genes[i], health[i], d);
            }
            if(max < total){
                max = total;
            }
            if(min > total){
                min = total;
            }
        }
        in.close();
        System.out.print(String.valueOf(min) + " ");
        System.out.println(max);
    }
    static int totalHealth(String a_word, int score, String d){
    	int total = 0;
        int length = a_word.length();
        for(int i = 0; i < d.length() - length + 1; i++){
            if(a_word.equals(d.substring(i, i + length))){
            	total += score;
            }
        }
        return total;
    }
}


/*<Above solution is here>
https://www.toptal.com/java/the-trie-a-neglected-data-structure
*/
