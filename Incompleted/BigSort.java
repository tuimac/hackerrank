import java.util.*;

public class Solution {

    static String[] bigSorting(String[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].length() < 20 && arr[j + 1].length() < 20){
                    if(Long.parseLong(arr[j]) > Long.parseLong(arr[j + 1])){
                        arr = swap(arr, j);
                    }
                }else{
                    if(arr[j].length() - arr[j + 1].length() > 0){
                        arr = swap(arr, j);
                    }else{
                        if(compareBig(arr[j], arr[j + 1]) == true){
                            arr = swap(arr, j);
                        }                        
                    }
                }
            }
        }
        return arr;
    }
    
    static String[] swap(String[] arr, int i){
        String tmp = "";
        tmp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = tmp;
        return arr;
    }
    
    static boolean compareBig(String a, String b){
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) > b.charAt(i)){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
***********************************************************************

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String[] bigSorting(String[] arr) {
		try {
            int[] arrInt = new int[arr.length];
            for(int i = 0; i < arr.length; i++){
                arrInt[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(arrInt);
            for(int i = 0; i < arr.length; i++){
                arr[i] = String.valueOf(arrInt[i]);
            }
            return arr;
		}catch(NumberFormatException e) {
			return bigSorting2(arr);
		}
	}

	static String[] bigSorting2(String[] arr) {
		for(int i = arr.length; i >= 1; i--){
			for(int j = 0; j < i - 1; j++){
				if(isDigitBig(arr[j], arr[j + 1])) arr = swapTheString(arr, j, j + 1);
				else{
					if(arr[j].length() == arr[j + 1].length()){
						if(isBigNum(arr[j], arr[j + 1])) arr = swapTheString(arr, j, j + 1);
					}
				}
			}
		}
		return arr;
	}
    
    

	static boolean isBigNum(String a, String b){
		for(int i = 0; i < a.length(); i++){
			if(a.charAt(i) > b.charAt(i)){
				return true;
			}else if(a.charAt(i) < b.charAt(i)){
				return false;
			}
		}
		return false;
	}

	static String[] swapTheString(String[] arr, int a, int b){
		String tmp = "";
		tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
		return arr;
	}

	static boolean isDigitBig(String a, String b){
		if(a.length() > b.length()) return true;
		else return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for(int arr_i = 0; arr_i < n; arr_i++){
			arr[arr_i] = in.next();
		}
		String[] result = bigSorting(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
		}
		System.out.println("");


		in.close();
	}
}

#How about replacing Bignumber to small but larger number in the array.
#then you sort that array. So we need the index for max value.

