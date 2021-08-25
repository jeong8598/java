package ch06;

public class Car05_ex01 {

	public static void main(String[] args) {
		
		//자동차 주문
		Car05 myCar = new Car05();
		
		//가스충전기능실행
		myCar.setGas(10);
		
		//가스충전여부 확인
		boolean gasState = myCar.isLeftGas();
		if (!gasState) {
			myCar.run();//달려라기능
		}
		
		//충전알림
		if(!myCar.isLeftGas()) {
			System.out.println("가스를 주입안해도돼요");
		}else {
			
			System.out.println("가스를 주입하세요");
		}
	}
}

