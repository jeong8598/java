package ch07;

public class Cellphone01 {
	//field
	String model;
	String color;
	
	//constructor
	
	//method
	void powerOn() {System.out.println("전원을 on");}
	void powerOff() {System.out.println("전원을 off");}
	void bell() {System.out.println("bell이울려요");}
	void sendVoice(String msg) {System.out.println("나:"+msg);}
	void receiveVoice(String msg) {System.out.println("상대:"+msg);}
	void hangup() {System.out.println("전화를 끊습니다.");}
	
}

