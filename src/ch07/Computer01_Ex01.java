package ch07;

public class Computer01_Ex01 {

	public static void main(String[] args) {
		double r = 10;
		Calculator01 cal = new Calculator01();
		System.out.println("원면적"+cal.areaCircle(r));//부모클래스인 Calculator01 메서드 호출
		
		
		Computer01 com = new Computer01();
		System.out.println("원면적"+com.areaCircle(r));//자식클래스 computer01에서 재정의한 메서드가 호출됨
		
		System.out.println("------------------");
		
		//다형성
		//원 is a 도형
		//삼각형 is a 도형
		//도형 = 원
		//도형 = 삼각형
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조
		//Computer is a Calculator
		//Calculator = Computer	(오른쪽의값을 왼쪽으로 넣어준다) 
		//부모클래스 참조변수  =  new 자식클래스
		Calculator01 obj = new Computer01();
		System.out.println("원면적"+obj.areaCircle(r));	
		//단일상속이므로 계층을 추적할 수 있고 다형성을 구현을 한 상태에서 오버라이딩 된 메소드를 호출할때
		//같은 메소드가 있을때 조상부터 확인해보고 가장 마지막에 만나는 자손 클래스의 메소드를 호출
	}

}
