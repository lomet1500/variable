package condition;

public class ConditionExample1 {

	public static void main(String[] args) {
		int score = 65;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = " B+ ";
			} else {
				grade = "B ";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C ";
			}
		} else if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D ";
			}
		
		} else {
			grade = "F";
			
		}

		// 70점 이상이면 C, 60점 이상이면 D, 60점 미만 F
		System.out.println(score + "점은" + grade + "입니다");

	}

}

