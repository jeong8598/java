package ch06;

//계산하는 기능을 실행하는 클래스
public class Calculator01_ex01 {

	public static void main(String[] args) {
	
		
		
		//Calculator01클래스의 객체 생성 및 변수에 할당
		Calculator01 c1 = new Calculator01();
		//계산기의 전원을 켜세요
		c1.powerOn();
		//Calculator01클래스의 divide()호출하여
		//메소드의 리턴값을 받아 z에 저장
		double z = c1.divide(10.5, 3);
		System.out.println("z="+z);
		//임의의 숫자를 더하기 기능을 수행하세요
		byte x = 10;
		byte y = 90;
		int result =0;
		result = c1.plus(x,y);
		System.out.println(result);
		
		
		//실수끼리의 더하기 연산
		double r1=c1.add(15.1, Math.PI);
		System.out.println(r1);
		
		
		c1.powerOff();//전원을 끄세요
	}

}
