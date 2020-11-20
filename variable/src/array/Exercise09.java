package array; // p.183 9번

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3.점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수: ");
				studentNum = scanner.nextInt();
				
				
					
			} else if (selectNo == 2) {
				scores = new int [studentNum];
						
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " );
					scores[i] = scanner.nextInt();
					
	
				}
			} else if (selectNo == 3) {
				
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
					
				}
				
			} else if (selectNo == 4) {
				int max = 0;
				for(int i = 0; i<scores.length; i++) {
					studentNum += scores[i];
					if(max < scores[i]) {
						max=scores[i];
				}
				System.out.println("최고점수 : " + max);
				
				double avg = (double) studentNum / scores.length;
				System.out.println("평균점수 : " + avg);
				}
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
