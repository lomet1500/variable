package array;

public class MorningCode {

	public static void main(String[] args) {
		int[][] intAry = new int[5][5];
		int sum = 0;
	
		System.out.println( intAry[0][0] );
		System.out.println( intAry [0].length); 
		
		for (int i = 0; i < intAry.length; i++) {
			for(int j = 0; j < intAry[i].length; j++) {
				sum++;
				intAry[i][j] = sum;
				System.out.println("intAry[" + i + "," + j + "] = " + intAry[i][j]);
				
				
			}
		
			
	}

		int[][] intAry2 = 
			{
					{1,2,3,4,5},
					{6,7,8,9,10},
					{11,12,13,14,15},
					{16,17,18,19,20}
			};
		
		String [] strAry = {"Hello", "World"};
		for (String str : strAry) {
			System.out.println(str);
		}
}
}

