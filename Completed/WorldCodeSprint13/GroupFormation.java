/*Maybe constraint satisfaction problem is the answer of this question*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the membersInTheLargestGroups function below.
    static void membersInTheLargestGroups(int n, int m, int a, int b, int f, int s, int t) {
        
        Map<String,Integer> map = new HashMap<String,Integer>();
        List<Set<String>> list = new ArrayList<Set<String>>();
        List<List<String>> finalList = new ArrayList<List<String>>();
        List<List<String>> maxList = new ArrayList<List<String>>();
        
        int max = 0;
        
        for(int i = 0; i < n; i++){
            String[] input = scanner.nextLine().split("\\s");
            map.put(input[0], Integer.parseInt(input[1]));
        }
        
        System.out.println(map);
        
        Set<String> set = new HashSet<String>();
        
        for(int i = 0; i < m; i++){
            String[] input = scanner.nextLine().split("\\s");
            for(int j = 0; j < list.size(); j++){
                set = list.get(j);
                if(checkName(set, input[0]) || checkName(set, input[1])){
                    set.add(input[0]);
                    set.add(input[1]);
                }else{
                    set = new HashSet<String>();
                    set.add(input[0]);
                    set.add(input[1]);
                    list.add(set);
                }
            }
        }
        
        System.out.println(list);
        
        for(int i = 0; i < list.size(); i++){
            set = list.get(i);
            List<String> setlist = new ArrayList<String>(set);
            int first = 0;
            int second = 0;
            int third = 0;
            for(int j = 0; j < setlist.size(); i++){
                if(map.get(setlist.get(j)) == 1){
                    first++;
                    if(first > f) break;
                }else if(map.get(setlist.get(j)) == 2){
                    second++;
                    if(second > s) break;
                }else{
                    third++;
                    if(third > t) break;
                }
                if(setlist.size() == j + 1) finalList.add(setlist);
            }
        }
        
        System.out.println(finalList);
        
        for(int i = 0; i < finalList.size(); i++){
            List<String> tmplist = finalList.get(i);
            if(max <= set.size()){
                maxList.add(tmplist);
            }
        }
        
        for(List<String> l : maxList){
            for(String name : l){
                System.out.println(name);
            }
        }
    }
    
    static boolean checkName(Set<String> set, String name){
        if(set.contains(name)) return true;
        else return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nmabfst = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmabfst[0]);

        int m = Integer.parseInt(nmabfst[1]);

        int a = Integer.parseInt(nmabfst[2]);

        int b = Integer.parseInt(nmabfst[3]);

        int f = Integer.parseInt(nmabfst[4]);

        int s = Integer.parseInt(nmabfst[5]);

        int t = Integer.parseInt(nmabfst[6]);

        membersInTheLargestGroups(n, m, a, b, f, s, t);

        scanner.close();
    }
}


/*************************************************************************************/

/*https://www.hackerrank.com/contests/world-codesprint-13/challenges/group-formation*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    // Complete the membersInTheLargestGroups function below.
    static void membersInTheLargestGroups(int n, int m, int a, int b, int f, int s, int t) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String[] input = scanner.next().split("\\s");
            map.put(input[0], Integer.parseInt(input[1]));
        }
        for(int i = 0; i < m; i++){
            String[] input = scanner.next().split("\\s");
            
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nmabfst = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nmabfst[0]);

        int m = Integer.parseInt(nmabfst[1]);

        int a = Integer.parseInt(nmabfst[2]);

        int b = Integer.parseInt(nmabfst[3]);

        int f = Integer.parseInt(nmabfst[4]);

        int s = Integer.parseInt(nmabfst[5]);

        int t = Integer.parseInt(nmabfst[6]);

        membersInTheLargestGroups(n, m, a, b, f, s, t);

        scanner.close();
    }
}
