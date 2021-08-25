package ch07;

//overrideing
// override - vt. ‘~위에 덮어쓰다(overwrite).’, ‘~에 우선하다.’
//-조상클래스로부터 상속받은 메서드의 내용을 상속받는 클래스에 맞게 변경하는 것을 오버라이딩이라고 한다


public class Calculator01 {
	//field
	
	//constructor
	
	//method
	//실수형태  리턴하는 함수 areaCircle(double r){}
	 double areaCircle(double r){
		 System.out.println("Calculator01- areaCircle(double r)실행");
		 return 3.14 * r * r ;
	 }
	
}
