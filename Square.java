import java.util.Arrays;

public class Square {

	public static void main(String[] args) {
		
		String arr[] = new String[]{"200 250"};
		int s[] = getSum(arr);
		System.out.println(Arrays.toString(s));
		
		String s1 = "aaa";
		String b = "aaabbb";
		if(s1.contains(b)) {
			System.out.println("a ");
		}
		
	}

	public static int computeIsASquare(int inputInteger) {

		int isASquare = 0;

		double sq = Math.sqrt(inputInteger);
		int s = (int) sq;
		int even = 2;

		int power = (int) Math.pow(sq, even);
		int square = (int) Math.pow(s, even);

		if (power == square) {
			isASquare = 1;
		
		}
		return isASquare;
	}
	
	public static int[] getSum(String[] arr){
		int sq[] = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		for (int c = 0; c < arr.length; c++) {
			String s = arr[c];
			String[] splited = s.split("\\s+");

			int[] ints = new int[splited.length];
			for (int i = 0; i < splited.length; i++) {
				ints[i] = Integer.parseInt(splited[i]);
				
			}
			Arrays.sort(ints);
		
			int totalSquares = 0;
			for (int j = ints[0];; j++) {
				System.out.println("The number is: "+j);
				int isAQaure = computeIsASquare(j);
				if (isAQaure == 1) {
					totalSquares = totalSquares + 1;
				}
				if (j == ints[ints.length - 1]) {
					break;
				}
			}
			sq[c] = totalSquares;
			
		}
		return sq;
	}

}
