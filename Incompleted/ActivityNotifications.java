/***************************************************************************************/
/*20180519 timeout solution*/
/*https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int activityNotifications(int[] expenditure, int d) {
        int numOfAlert = 0;
		for(int i = d; i < expenditure.length; i++){
            int checkNum = expenditure[i];
			int[] subArray = new int[d];
			int count = i - 1;
			for(int j = 0; j < d; j++) {
				subArray[j] = expenditure[count];
				count--;
			}
			Arrays.sort(subArray);
			double median = 0;
			int middleIndex = d / 2;
			if(d % 2 == 1){
				median = subArray[middleIndex];
			}else{
				median = (double) (subArray[middleIndex] + subArray[middleIndex - 1]) / 2;
			}
            if(checkNum >= median * 2.0) numOfAlert++;
		}
        return numOfAlert;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		int[] expenditure = new int[n];
		for(int expenditure_i = 0; expenditure_i < n; expenditure_i++){
			expenditure[expenditure_i] = in.nextInt();
		}
		int result = activityNotifications(expenditure, d);
		System.out.println(result);
		in.close();
	}
}
