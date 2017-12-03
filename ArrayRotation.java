package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
	
public static int[] arrayLeftRotation(int[] a, int n, int k) {
	System.out.println("input array:"+Arrays.toString(a));
      // Right Rotation  
	 int[] rightRotationArray = a;
	
        for(int i=0;i<k;i++) {
            int[] b = new int[rightRotationArray.length];
           
            int rotationNo = i + 1;
        //    System.out.println(" rotation no:"+rotationNo);
			for (int j = 0; j < n; j++) {
				if (j == 0) {
					b[j] = rightRotationArray[rightRotationArray.length-1];
				} else {
                    b[j] = rightRotationArray[j-1];
				}
				
			}
			rightRotationArray = b;
			System.out.println("Rotaion number: "+rotationNo+". Right rotation: "+Arrays.toString(rightRotationArray));
        }
	
	System.out.println("Right rotation: "+Arrays.toString(rightRotationArray));
	
	int[] leftRotationArray = a;
	
	for(int i=0;i<k;i++) {
        int[] b = new int[leftRotationArray.length];
               
        int rotationNo = i + 1;
      //  System.out.println(" rotation no:"+rotationNo);
		for (int j = n-1, l=0; j <= n; j--,l++) {
			if(j<0) {
				break;
			}
			if(l==0) {
			b[leftRotationArray.length-1] = leftRotationArray[l];
			} else {
				b[j] = leftRotationArray[j+1];
			}
			
		}
		leftRotationArray = b;
		System.out.println("Rotaion number: "+rotationNo+". Right rotation: "+Arrays.toString(leftRotationArray));
    }
	System.out.println("Left rotation: "+Arrays.toString(leftRotationArray));
      return a;
    }
	
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int a[] = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	      
	        int[] output = new int[n];
	        output = arrayLeftRotation(a, n, k);
	        for(int i = 0; i < n; i++)
	            System.out.print(output[i] + " ");
	      
	        System.out.println();
	      
	    }
	}


