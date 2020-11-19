package variable2;

public class StudentExample2 {
	public static void main(String[] args) {
		Student2 d1 = new Student2();
		//d1.name = "Kim";
		d1.setName1("정병기");
		//d1.sid = 16;
		d1.setSid1(121212);
		//d1.eng_score = 90;
		d1.setEng_score1(80);
		//d1.math_score = 100;
		d1.setMath_score1(70);
		System.out.println("학생이름: " + d1.getName1());
		System.out.println("학번: " + d1.getSid1());
		System.out.println("영어점수: " + d1.getEng_score1());
		System.out.println("영어점수: " + d1.getMath_score1());
		d1.studentInfo();
		
		
		
	}

}
