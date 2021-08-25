package ch06;

//Car03클래스로부터 객체를 생성하여 실행하는 클래스
public class Car03_ex01 {

	public static void main(String[] args) {
		Car03 myCar = new Car03();
		System.out.println(myCar.company);
		
		System.out.println("----------------------");
		
		Car03 m1 = new Car03("suv");
		System.out.println(m1.model);
		System.out.println(m1.color);
		System.out.println(m1.maxSpeed);
		System.out.println("----------------------");
		
		Car03 m2 = new Car03("suv1","black");
		System.out.println(m2.model);
		System.out.println(m2.color);
		System.out.println(m2.maxSpeed);
		System.out.println("----------------------");
		
		Car03 m3 = new Car03("suv2","black",300);
		System.out.println(m3.model);
		System.out.println(m3.color);
		System.out.println(m3.maxSpeed);
		System.out.println("----------------------");

	
	
	}
	
}
