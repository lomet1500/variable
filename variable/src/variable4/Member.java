package variable4;

public class Member {
	private int number;
	private String name;
	private String call;
	private String class_name;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number; //this : 같은 필드이름 구별, calss의 number로 구별하려고 함.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCall() {
		return call;
	}
	public void setCall(String call) {
		this.call = call;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	@Override //오른쪽 마우스 -> source -> Genarate to string()...
	public String toString() {
		return "Member [회원번호: " + number + ", 회원이름: " + name + ", 연락처: " + call + ", 강좌: " + class_name + "]";
	}

}