package variable;

public class MorningCode {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 7 == 0 | i % 8 == 0) {
				sum += i;
			System.out.println(sum);
		}
	}
	}
}

