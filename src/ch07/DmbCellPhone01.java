package ch07;

//이 클래스는 CellPhone클래스르르 상속받는 자식클래스이다
//class 자식클래스명 extends 부모클래스명{}
public class DmbCellPhone01 extends Cellphone01{
	//이 클래스에는 Cellphone01클래스로 부터 상속받은 
	//field
	int channel;
		
	//constructor : 주로 외부에서 받은 데이터 값을 받아 기본값으로 초기화시켜주는 역할
	public DmbCellPhone01(String model, String color, int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	
	//method
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 dmb방송 수신을 시작");
	}
	void changeOnDmb(int channel) {
		this.channel = channel;
		System.err.println("채널"+channel+"번으로 바뀝니다.");
	}
	
	void turnOffDmb() {
		System.out.println("채널"+channel+"번 dmb방송 수신을 종료");
	}
}
