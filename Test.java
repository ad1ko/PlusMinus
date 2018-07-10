package may09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//String str = "driver web";
		//System.out.println(str.replace('i', 'I'));
//		int [][] a = {{3,7,-12}, {2,424,3}, {8,34,9}};
//		   int sum= 0;
//	        int sum2 = 0;
//	        for(int i = 0; i< a.length; i++){
//	            sum += a[i][a.length-1-i];
//	            sum2 += a[i][i];
//	        }
//	            
//	     int dif =sum -sum2;
//	     System.out.println(dif);
		
		int arr[]= {2,9,0,4,6,0,9,2,5,7,0,3,12,5,0,0,53,7};
		int newArr[] = new int[arr.length];
//		List<Integer> lst = new ArrayList<>();
//		for (Integer integer : arr) {
//			if(integer!=0) {
//			lst.add(integer);
//			}
//		}
//		for (Integer integer : arr) {
//			if(integer==0) {
//				lst.add(integer);
//			}
//		}
//		int[] arr1= new int [lst.size()];
//		for(int i = 0; i< lst.size();i++) {
//			arr1[i]=lst.get(i).intValue();
//		}
//		
//		for(int i = 0; i<arr.length; i++) {
//			
//			if(arr[i] ==0) {
//				int k = i+1;
//				newArr[i]=arr[k];
//			}else {
//				newArr[i]=arr[i];
//			}
//			
//		}
		
		for(int i = 0; i< arr.length;i++) {
			for(int j = 0; j<arr.length;j++) {
				if(j==0) {
					int temp= 0;
				}
			}
		
		}
		
		
		
		for (int i : arr) {
			System.out.print(i+ ", ");
		}
		System.out.println();
		for (int i : newArr) {
			System.out.print(i+", ");
		}

	}

}
