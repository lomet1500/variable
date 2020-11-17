package interation;

public class WhileMyExample {

	public static void main(String[] args) {
		// 1부터 10까지 합:
		int sum = 0;
		int i = 0;
		while (true) {
			sum += i;
			
			if (i == 10) {
				break;
			}
			i++;
		}
			System.out.println( " 1부터 10까지 합: " + sum );
		
		}
	}


