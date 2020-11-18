package array;

public class MethodExample {

	public static void main(String[] args) {
		// 두수를 더해서 2로 나누고 50을 더하고 다시 10으로 나눔.
		int num1, num2, result;
		num1 = 34;
		num2 = 55;
		result = sumMethod(num1, num2);
		System.out.println(result);
		int val1 = 22, val2 = 55;
		result = sumMethod(val1, val2);
		System.out.println(result);
	}

	public static int sumMethod(int numb1, int numb2) {
		int result = numb1 + numb2;
		result = result / 2;
		result = result + 50;
		result = result / 10;
		return result;
	}

}
