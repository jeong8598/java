package ch06;

import java.util.Date;

//자동차에 대한 속성(과 기능)을 가진 클래스

//클래스 - 속성(field),기능(method)

public class Car01 {

	//속성=>필드(field)=>변수선언
	//[접근제한자] [속성] 데이터타입 변수명;
	//고유데이터				색상발주 red,제조사현대,기아 , 최고속력350 , 제조날짜 년월일
	String color	= "white";	//색상
	String maker = "현대";	//제조사
	int maxSpeed;	//최고속도
	Date makeDate = new Date();	//제조날짜
	int price	= 3000;
	double maxKGM;	//최대토크
	
	//상태데이터-	현재속도, 엔진회전수
	int speed;	//현재속도

	//부품	- 또다른 클래스도 필드로 사용할 수 있다.
	//Engine engine;
	//Tire tire;
	
	//생성자(constructor)
	
	//기능-method
	//[접근제한자] [속성] 리턴유형 함수명([매개변수리스트]){}
	void move() {
		System.out.println("move()호출성공!");
	}
	//움직이다 0 1 2 3 4 5 
	//멈추다 	5 4 3 2 1 0
	void stop() {
		System.out.println("stop()메소드 호출성공!");
	}
	
	
	
	//10/12(월) getter/setter실습
	//마우스 우버튼 source>generate Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public Date getMakeDate() {
		return makeDate;
	}
	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getMaxKGM() {
		return maxKGM;
	}
	public void setMaxKGM(double maxKGM) {
		this.maxKGM = maxKGM;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
	
	
	
	
	
}
