package ch07;

//실행클래스
//추상클래스의 객체를 생성하지 못하므로
//추상클래스의 기능을 사용하고 싶다면
//그것을 상속받은 실체클레스의 객체를 생성해서 사용
public class Phone01_ex {

	public static void main(String[] args) {
		//Phone01 ph=new Phone01("내거");	//컴파일에러
		//Cannot instantiate the type Phone01 
		//추상클래스Phone01의 생성자를 호출해서 객체를 생성할 수 없다.
		
		SmartPhone01 ph = new SmartPhone01("내거");
		ph.turnOn();	//부모(추상)클래스에서 상속받은 메서드
		ph.internet();	//자식(실체)클래스 메서드
		ph.turnOff();	//부모(추상)클래스에서 상속받은 메서드
	}

}
