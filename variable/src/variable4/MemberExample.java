package variable4;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setNumber(1);
		System.out.println(m1.getNumber());
		m1.setName("홍길동");
		System.out.println(m1.getName());
		m1.setCall("010-2345-6789");
		System.out.println(m1.getCall());
		m1.setClass_name("java");
		System.out.println(m1.getClass_name());
	System.out.println(m1);	
	}
}
