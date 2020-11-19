package variable2;

public class VariableExample {
	public static void main(String[] args) {
		int num = 10;
		String str = "Hello";
		double dbl = 3.4;

		String name = "Hong";
		int age = 10;
		double height = 178.8;

		String name1 = "Hwang";
		int age1 = 15;
		double height1 = 188.8;

		Person p1 = new Person("Choi", 20, 175.5, 72.4);
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
		System.out.println("p1의 몸무게: " + p1.getWeight());
		
	
		System.out.println("==============================");
		// p1.name = "Hong";
		p1.setName("홍");
		// p1.age = -10;
		p1.setAge(11);
		// p1.height = 178.8;
		p1.setHeight(178.8);
		System.out.println("p1의 이름: " + p1.getName());
		System.out.println("p1의 나이: " + p1.getAge());
		System.out.println("p1의 키: " + p1.getHeight());
		p1.showInfo();

		Person p2 = new Person();
		// p2.name = "Hwang";
		p2.setName("황");
		// p2.age = 15;
		p2.setAge(15);
		// p2.height = 188.8;
		p2.setHeight(188.8);
		p2.showInfo();

		Person p3 = new Person();
		// p3.name = "Park";
		p3.setName("박");
		// p3.age = 17;
		p3.setAge(17);
		// p3.height = 166.8;
		p3.setHeight(166.8);
		// p3.weight = 56.5;
		p3.showInfo();

		Person[] persons = { p1, p2, p3 };
		for (Person per : persons) {
			// System.out.println(per.name);
			// System.out.println(per.age);
			// System.out.println(per.height);
			// System.out.println(per.weight);

		}
		// System.out.println(p1.name);
		// System.out.println(p1.age);
		// System.out.println(p1.height);
		// System.out.println(p1.weight);
	}

}
