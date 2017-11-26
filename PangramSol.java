import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PangramSol {
	
	
	static String isPangram(String[] strings) {
        StringBuilder status = new StringBuilder();
        boolean statusFlag = true;
		String pa[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
				"t", "u", "v", "w", "x", "y", "z" };
		
		List<String> li = Arrays.asList(pa);
		
			
		for (int s = 0; s < strings.length; s++) {
			String str = strings[s];
			if (str.length() < 26) {
				statusFlag = false;
				status.append("0");
				continue;
			}
			String[] cstr = str.split("");
			for (int a = 0; a < cstr.length; a++) {
				if (li.contains(cstr[a])) {
					statusFlag = true;
					continue;
				} else {
					statusFlag = false;
					continue;
				}

			}
			if (statusFlag) {
				status.append("1");
			} else {
				status.append("0");
			}
		}
			
		
		
        return status.toString();
	}
	
	public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        String res;
        int strings_size = 0;
        strings_size = Integer.parseInt(in.nextLine().trim());

        String[] strings = new String[strings_size];
        for(int i = 0; i < strings_size; i++) {
            String strings_item;
            try {
                strings_item = in.nextLine();
            } catch (Exception e) {
                strings_item = null;
            }
            strings[i] = strings_item;
        }

        res = isPangram(strings);
        bw.write(res);
        bw.newLine();

        bw.close();
    }


}
