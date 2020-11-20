package method;

public class MethodExample {
	public static void main(String[] args) {
		Math m1 = new Math();
		double sum = m1.sum(10.5, 20);
		System.out.println("결과: " + sum);
		double area = m1.getArea(5.5); // 반지름 pi*r*r;
		System.out.println("넓이: " + area);
		// 정사각형 넓이: getRectagle, 매개변수: 4.2
		double area1 = m1.getRectagle(4.2);
		System.out.println("넓이: " + area1);
		// 직사각형 넓이: getRectagle, 매개변수: 4.2, 2.4
		double area2 = m1.getRectagle(4.2, 2.4);
		System.out.println("직사각형 넓이: " + area2);

		int sum1 = m1.getArySum(new int[] {5,15,25});
		System.out.println(sum1);
		
		Person p1 = new Person("이창호", 10, 135.5, 32.5);
		double d1 = m1.getProperWeight(p1);
		if(p1.weight > d1) {
			System.out.println("체중과다...");
		}else if (p1.weight == d1){
			System.out.println("적정체중...");
		}else {
			System.out.println("체중미달...");
		}
	}

}
