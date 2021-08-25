package ch07;

//이 클래스는  RemoteControl인터페이스의 구현클래스들의 객체를 생성하여 실행하는 클래스
/*인터페이스 구현객체 사용법
* 인터페이스 변수;
* 변수 = 구현객체;  
* 
* 또는
* 인터페이스 변수 = 구현객체; 
*/
public class RemoteControl_ex01 {

	public static void main(String[] args) {
		RemoteControl rc = null;//인터페이스 변수;
		rc= new TV();		//변수=구현객체;	=>TV객체를 인터페이스타입에 대입
		
		//인터페이스의 turnOn()과 turnOff()호출 =>실제구현은  TV의  실체메서드가 동작
		rc.turnOn();	//TV의 전원을 켭니다.
		rc.turnOff();	//TV의 전원을 끕니다.
				
		rc= new Audio01();	//변수=구현객체;
		
		//인터페이스의 turnOn()과 turnOff()호출
		rc.turnOn();	//Audio의 전원을 켭니다.
		rc.setVolume(-10);	//현재 TV의 볼륨=0
		rc.setVolume(100);	//현재 TV의 볼륨=10
		rc.setVolume(5);	//현재 TV의 볼륨=5
		rc.turnOff();	//Audio의 전원을 끕니다.
		System.out.println();
		
		//인터페이스에서 정의딘 정적메서드 사용
		//인터페이스명.메서드명();
		RemoteControl.changeBattery();

		//디폴트메서드 사용
		//인터페이스타입변수.메서드명();
		rc.setMute(true);	//무음처리합니다.
		
	}

}
