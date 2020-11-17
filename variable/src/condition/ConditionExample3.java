package condition;

public class ConditionExample3 {

	public static void main(String[] args) {
		{
			int randomValue = ((int) (Math.random() * 6) + 1);
			System.out.println(randomValue); // 0 <random < 1
		}

		int num = (int) (Math.random() * 6) + 1;

		switch (num) {
		case 1:
			System.out.println(" uno ");
			break;
		case 2:
			System.out.println(" dos ");
			break;
		case 3:
			System.out.println(" 三 ");
			break;
		case 4:
			System.out.println(" 四 ");
			break;
		case 5:
			System.out.println(" FIVE ");
			break;
		default:
			System.out.println(" SIX ");
			break;
		}

	}
}



