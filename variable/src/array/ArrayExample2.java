package array;

public class ArrayExample2 {
	public static void main(String[] args) {
		double[] dAry;
		double result = 0;
		//메소드호출.
		dAry = new double[]{23.2, 55.3, 52.8, 62.8};
		for(int i = 0; i < dAry.length; i++) {
			result += dAry[i];
		}
		
		System.out.println("결과값: " + result);
     
	}

	// double [] => 23.2, 55.3, 52.8, 62.8 : dAry
	// method : doubleSum(), 매개변수 : double[]
	// 반환해주는 값 : double.
	public static double Sum (double[] ary) {
		double Sum = 0;
		for (double num : ary) {
			 Sum += num;	 
		}
		return ;
	}
}
