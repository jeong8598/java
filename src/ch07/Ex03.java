package ch07;

//상속
//조상클래스의 생성자가 자동으로 호출된다.
//super() : 부모클래스의 생성자 호출.
//				주의. 반드시 생성자 안에서 반드시 첫번째 문장으로 작성해야한다.
//참고. this(): (자신의)또 다른 생성자를 호출

public class Ex03 {

	public static void main(String[] args) {
		Son03 s = new Son03(123);//조상클래스부터 기본생성자가 (컴파일러가) 자동으로 순서대로 호출 명시적으로 super();로 나타낼 수있음

	}
}
class GrandFather03 {			//class GrandFather03 extends Object{
	GrandFather03(){System.out.println("GrandFather03의 기본생성자");}
}

class Father03 extends GrandFather03 {
	String name;
	String ssn;
	
	Father03(){System.out.println("Father03의 기본생성자");}
	Father03(int a){System.out.println("Father03의 int1개의 생성자");}
	Father03(double a){System.out.println("Father03의 double1개의 생성자");}
}

class Son03 extends Father03{
	
	 Son03(){
		super(100);
		System.out.println("Son03의 기본생성자");
		//super();//컴파일에러
		//Constructor call must be the first statement in a constructor
}
	 Son03(int x){
		 super(x);
		System.out.println("Son03의 int1개의 생성자");
	 }
}

