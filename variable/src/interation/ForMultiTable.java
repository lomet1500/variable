package interation;

public class ForMultiTable {

	public static void main(String[] args) {
		// for(9번 반복)
		for (int i = 1; i <= 9; i++) {
			System.out.println("2 *" + i + " = " + (2 * i)); // 2*4
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println("3 *" + i + " = " + (3 * i));
		}
		int num = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + " = " + (num * i));
		}
		num++;
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + "*" + i + " = " + (num * i));
		}
	
		for (int num2 = 2; num2 <= 9; num2++) {
			System.out.println("[" + num2 + "단]");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num2 + "*" + i + " = " + (num2 * i));
			}
		}
	}
}