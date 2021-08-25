package ch11.polymophism;

//이클래스는 실행클래스로서 필드의 다형성을 살펴보고자한다.
public class CarExample01 {

	public static void main(String[] args) {
		//Car01 객체생성
		Car01 car = new Car01();
		
		//Car01의 run()을 5번 반복실행
		for(int i = 1 ; i<6 ; i++) {
			int problemLocation = car.run();
			switch (problemLocation) {
			case 1: System.out.println("앞왼쪽 HankookTire로 교체");	//앞왼쪽 타이어가 펑크났을 때
				car.fLTire= new HankookTire01("앞왼쪽",15);	//자동타입변환(Promotion)
				//부모클래스타입의 참조변수= new 자식클래스명();
				//Car01 car = new HankookTire01("앞왼쪽",15);
				//Car01의 필드에는 Tire클래스타입의 필드 fLTire가 선언되어있다
				//따라서 Car01의 필드인 fLTire에 HankookTire01()객체가 들어갈 수있다.
				break;
			case 2:	System.out.println("앞오른쪽 KumhoTire로 교체");	//앞오른쪽 타이어가 펑크났을 때
				car.fRTire = new KumhoTire01("앞오른쪽",13);				//
			break;
			case 3: System.out.println("뒤왼쪽 HankookTire로 교체");	//뒤왼쪽 타이어가 펑크났을 때
				car.bLTire = new HankookTire01("뒤왼쪽",14);
			break;
			case 4: System.out.println("뒤오른쪽 KumhoTire로 교체");	//뒤오른쪽 타이어가 펑크났을 때
				car.bRTire = new KumhoTire01("뒤오른쪽",17);
			break;
			}
			System.out.println("----------------");	//문제없이 잘 굴러간 경우
		}
	}

}
