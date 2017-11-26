import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CompressedStringSolution {
	
		static String compressedString(String message) {
	char[] messageCharacters = message.toCharArray();
	
	HashMap charMap =null;
	Map<Integer,HashMap<Character,Integer>> finalMap = new HashMap<Integer,HashMap<Character,Integer>>();
	char msgChar = ' ';
	
	char prevChar = ' ';
	
	int keyNo =1;
	StringBuilder sb = new StringBuilder();
	int preKeyNo = 0;
	int occurence = 0;	
	StringBuilder str = new StringBuilder();
	List<String> li = new ArrayList<String>();
	
	for(int i=0;i<messageCharacters.length;i++) {
		msgChar = messageCharacters[i];		
		
		if(i==0 || msgChar != prevChar) {
			occurence = 1;
			charMap = new HashMap();
			charMap.put(msgChar,occurence);
			if(i!=0) {
				keyNo = keyNo+1;
			}
			finalMap.put(keyNo, charMap);
			preKeyNo = keyNo;
			occurence = 0;
		} else if (msgChar == prevChar) {
			HashMap<Character,Integer> hm = new HashMap();
			hm = (HashMap<Character, Integer>) finalMap.get(preKeyNo);
			Character key = ' ';
			for(Entry<Character, Integer> entry: hm.entrySet()){		           
	                key =  entry.getKey();
	                break; 		           
	        }			
			
			int occur = (int) hm.get(key);
			occur = occur + 1;
			hm.put(msgChar,occur);
			finalMap.put(preKeyNo,hm);				
		}	
		prevChar = msgChar;		
	}
	
	for (Entry<Integer, HashMap<Character, Integer>> entry : finalMap.entrySet())
	{
		Object key = entry.getKey();
		HashMap<Character,Integer> hm1 = finalMap.get(key);
		//Iterator iterator1 = (Iterator) hm1.keySet();
		for (Entry<Character, Integer> entry2 : hm1.entrySet())
		{
			Object key1 = entry2.getKey();
			int occ = (int) hm1.get(key1);
			if(occ==1) {
				sb.append(key1);
			} else {
				sb.append(key1).append(occ);
			}
			
		}
		
	}	
	return sb.toString();

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

        String res;
        String message;
        try {
            message = in.nextLine();
        } catch (Exception e) {
            message = null;
        }

        res = compressedString(message);
       
        try {
        	 bw.write(res);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
