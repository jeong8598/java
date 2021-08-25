package ch11.polymophism;

//이 클래스는 Tire01클래스를  부품으로 가지는 클래스이다
//자동차는 Tire를 가진다. Car01 has a Tire01.
/*클래스간의 관계 ? 포함관계(composite)
	 한 클래스의 멤버변수로 다른 클래스를 선언하는 것
	- has a 관계*/

public class Car01 {
	//field
	String company;
	int price;
	String color;
	
	//부품관계의 field =>자동차는 4개의 타이어를 가진다.
	Tire01 fLTire = new Tire01("앞왼쪽",6);
	Tire01 fRTire = new Tire01("앞오른쪽",2);
	Tire01 bLTire = new Tire01("뒤왼쪽",3);
	Tire01 bRTire = new Tire01("뒤오른쪽",4);
	
	
	//constructor
	public Car01() {
		
	}
	//method
	//자동차가 가진 부품. 4개의 타이어가 모두  1회씩 회전시켜야한다.
	//각 Tire01객체의 roll()메서드를 호출한다.
	//호출한 roll()메서드가 false를 리터하는 경우에는
	//자동차를 멈추기위해		stop메서드르르 호출하고
	//문제가 발생한 해당 타이어의 번호를 리턴
	public int run() {
		System.out.println("자동차가 달리는 중");
		if(fLTire.roll()== false) {stop(); return 1;}
		if(fRTire.roll()== false) {stop(); return 2;}
		if(bLTire.roll()== false) {stop(); return 3;}
		if(bRTire.roll()== false) {stop(); return 4;}
		return 0;	//정상회전시
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다."); //타이어가 펑크날 때 실행
	}
}
