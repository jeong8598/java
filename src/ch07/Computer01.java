package ch07;

//이클립스에서는 클래스생성시 미리 부모클래스를 지정하여 생성할 수 있다 
//Calculator01을 상속받은 Computer01
//is a 관계 => 상속
//Computer is a Calculator
public class Computer01 extends Calculator01{
	//이미 부모클래스의 필드와 메소드를 상속받은 상태이다.
	//상속받은 메소드를 재정의한 것
	//@ : Annotation 
	//공지의 의미 + 조건충족하는 지 검사하는 기능
	@Override		//클래스
	 double areaCircle(double r){
		 System.out.println("Computer01- areaCircle(double r)함수야");
		 return Math.PI * r *r  ;
	 }
	

}
