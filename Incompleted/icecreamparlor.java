import java.util.*;

public class Solution {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] cost, int money) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < cost.length; i++){
            if(map.containsKey(money - cost[i])){
                System.out.println(map.get(money - cost[i]) + " " + (i + 1));
                return;
            }else{
                map.put(cost[i], i + 1);
            }
        }
        return;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        for(int i = 0; i < t; i++){
            int count = 0;
            int money = in.nextInt();
            in.nextLine();
            int n = in.nextInt();
            in.nextLine();
            int[] cost = new int[n];
            String[] line = in.nextLine().split("\\s");
            for(int j = 0; j < line.length; j++){
                cost[j] = Integer.parseInt(line[j]);
            }
            whatFlavors(cost, money);
        }

        in.close();
    }
}
