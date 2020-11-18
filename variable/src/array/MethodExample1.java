package array;

public class MethodExample1 {
	public static void main(String[] args) {
		showInfo("이창호");
		int result = showDouble(45);
		System.out.println("반환값: " + result);
		System.out.println("반환: " + showDouble(33.2));

	}

	public static void showInfo(String name) { // void : 반환 x
		System.out.println("안녕하세요. " + name + "입니다.");
	}

	public static int showDouble(int num) {
		return num * 2;
	}

	public static double showDouble(double num) {
		return num * 2;
	}

	// 정수형 변수 2개를 받아서 두수의 합을 반환해주는 메소드(sum)
	public static int sum(int a, int b) {
		int result = 0;
		result = a + b;
		return result;

	}

	// 정수형 변수 3개를 받아서 세수의 곱을 반환 메소드(multi)
	public static int multi(int a, int b, int c) {
		int result = 0;
		result = a * b * c;
		return result;
	}

	// double 2개를 받아서 첫번째 매개변수/두번째 매개변수 (divide)
	public static double divide(double num1, double num2) {
		return num1 / num2;

	}

	// double 2개를 받아서 큰수/작은수 (divide2)
	public static double divide2(double num1, double num2) {
		double result = 0;
		if (num1 < num2) {
		result = num2/num1;
		}else {
			result = num1/num2;
		}
			return result;

	}
}