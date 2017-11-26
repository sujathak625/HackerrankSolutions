import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PowerOf2Solution {
	

	 static int[] isPowerOf2(int[] nums) {
		 
		 int powerResult[] = new int[nums.length];
		 
		 for(int i=0;i<nums.length;i++) {
			 int num = nums[i];
			 if((num > 0) && ((num & (num - 1)) == 0)) {
				 powerResult[i] = 1;
			 } else {
				 powerResult[i] = 0;
			 }
		 }
		 return powerResult;

	    }


	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            try {
				bw = new BufferedWriter(new FileWriter(fileName));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int[] res;
        int nums_size = 0;
        nums_size = Integer.parseInt(in.nextLine().trim());

        int[] nums = new int[nums_size];
        for(int i = 0; i < nums_size; i++) {
            int nums_item;
            nums_item = Integer.parseInt(in.nextLine().trim());
            nums[i] = nums_item;
        }

        res = isPowerOf2(nums);
        for(int res_i = 0; res_i < res.length; res_i++) {
            try {
				bw.write(String.valueOf(res[res_i]));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				bw.newLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }

        try {
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
    }

}


