package com.sujatha;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonApetit {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
		int totalItems = scanner.nextInt();
		int kthItemNotEaten = scanner.nextInt();
        int total = 0;
       // System.out.println("total: "+total);
        
         for(int count=0;count<totalItems;count++) {
        	if(count==kthItemNotEaten) {
        		scanner.nextInt();
        		continue;
        	}
        	total = total + scanner.nextInt();
        }
        // System.out.println("total: "+total);
        int charged = scanner.nextInt();
        int annaShare = total/2;
       // System.out.println("annaShare "+annaShare);
        if(annaShare==charged) {
        	System.out.println("Bon Appetit");
        } else if(charged>annaShare) {
        	System.out.println(charged-annaShare);
        }
    }
}