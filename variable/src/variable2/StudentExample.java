package variable2;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Kim";
		s1.sid = 16;
		s1.eng_score = 90;
		s1.math_score = 100;
		
		Student s2 = new Student();
		s2.name = "Park";
		s2.sid = 15;
		s2.eng_score = 80;
		s2.math_score = 90;
		
		Student[] students = {s1, s2};
		for(Student stu : students) {
		System.out.println(stu.name);
		System.out.println(stu.sid);
		System.out.println(stu.eng_score);
		System.out.println(stu.math_score);
	}
	}
}
