package variable3;

public class MemberExample {
	public static void main(String[] args) {
		Member no = new Member();
		no.number = 1;
		no.name = "홍길동";
		no.call = "010-1234-5678";
		no.class_name = "스포츠댄스/수영";
		no.showMemberInfo();
		
		Member no2 = new Member();
		no2.number = 2 ;
		no2.name = "정병기";
		no2.call = "010-1234-5679";
		no2.class_name = "java";
		no2.showMemberInfo();
		
		Member[]members = new Member[2];
		
		
		
		
		  
		
	}
	
	
}
