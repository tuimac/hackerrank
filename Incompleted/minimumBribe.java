package training;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		
		for(int j = 0; j < t; j++) {
			int n = in.nextInt();
			int[] q = new int[n];
			for(int i = 0; i < n; i++) {
				q[i] = in.nextInt();
			}

			minimumBribes(q);
		}
		in.close();
	}

	static void minimumBribes(int[] q) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		
		for(int i = 0; i < q.length; i++){
			int diff = q[i] - (i + 1);
			
			if(diff > 2){
				System.out.println("Too chaotic");
				return;
			}else{
				if(diff > 0) count += diff;
				else{
					list.add(q[i]);
				}
			}
		}
		
		int[] array = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			array[i] = list.get(i);
		}
		
		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length - i - 1; j++) {
				if(array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
