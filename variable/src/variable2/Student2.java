package variable2;

public class Student2 {
	private String name1;
	private int sid1;
	private double eng_score1;
	private double math_score1;
	
	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName1() {
		return this.name1;
	}

	public void setSid1(int sid1) {
		this.sid1 = sid1;
	}

	public int getSid1() {
		return this.sid1;
	}

	public void setEng_score1(double eng_score1) {
		this.eng_score1 = eng_score1;
	}

	public double getEng_score1() {
		return this.eng_score1;
	}

	public void setMath_score1(double math_score1) {
		this.math_score1 = math_score1;
	}

	public double getMath_score1() {
		return this.math_score1;
	}


	public void studentInfo() {
		System.out.println("이름 : " + name1 + " " + "학번 : " + sid1 + " " + "입니다.");
	}
}
