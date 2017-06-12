import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ValidPairs {

	public static void main(String[] args) {
		ValidPairs vp = new ValidPairs();
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter even number of elements in the array...");
		int noOfItems = sc.nextInt();
		int[] inputArray = new int[noOfItems];
		System.out.println(
				"Enter 6elements in the array...");
		for(int c=0;c<noOfItems;c++) {
			inputArray[c] = sc.nextInt();
		}
		System.out.println(
				"Enter value of k");
		int k = sc.nextInt();
		int totalValidPairs = 0;
		totalValidPairs = vp.getNoOfValidPairs(inputArray, k);
		System.out.println("Total Valid Pairs is "+totalValidPairs);

	}
	
	public int getNoOfValidPairs(int input[],int k) {
		int noOfValidPairs = 0;
		int arrayLength =input.length;
		int totalPairs = arrayLength/2;
		System.out.println("Total Pairs that can be formed is..."+totalPairs);
		int arrayNo = 0;
		
		List al = new ArrayList();
		for(int i=0;i<input.length;i=i+2) {
			arrayNo = arrayNo+ 1;
			int[] arr = new int[2];
			arr[0] = input[i];
			arr[1] = input[i+1];
			al.add(arr);				
			if(arr.length==2) {continue;
			}
			
		}	
		for (int j = 0; j < al.size(); j++) {			
			if (j != al.size() - 1) {
				int arr1[] = (int[]) al.get(j);
				int arr2[] = (int[]) al.get(j + 1);
				if ((arr1[0]<=arr1[1] && arr2[0]<=arr2[1]) && (arr1[0] != arr2[0] && arr1[0] != arr2[1] && arr1[1] != arr2[0] && arr1[1] != arr2[1])
						&& arr1[0] + k == arr1[1] && arr2[0] + k == arr2[1]) {
					noOfValidPairs = noOfValidPairs + 1;
				} else {
					continue;
				}
			}
		}		
		return noOfValidPairs;
	}

}
