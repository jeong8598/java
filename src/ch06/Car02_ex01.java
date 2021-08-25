package ch06;

//자동차 클래스로 부터 객체를 생성하여 실행하는 클래스
public class Car02_ex01 {

	public static void main(String[] args) {
		//자도차 클래스로 부터 객체
		//클래스명(힙타입) 변수= new 클래스명();
		Car02 car1 = new Car02();
		//필드값가져오기 => 참조변수명.필드명
		//company 변수는 인스턴스 변수이므로 인스턴스 생성 후 '참조변수.인스턴스변수명'으로 접근
		System.out.println("car1.company="+car1.company);
		System.out.println("car1.color="+car1.color);	//자동초기화에 의해 char타입은 공백으로
		System.out.println("car1.maxSpeed="+car1.maxSpeed);	
		System.out.println("car1.model="+car1.model);
		
		//field 값변경 => 참조변수명.필드명 = 값;
		car1.color='w';
		System.out.println("변경된 car1.color="+car1.color);
		
		//static으로 선언된 필드와 메소드는 객체를 생성하지 않고도
		//즉, 인스턴스 생성없이'클래스이름.클래스변수명'으로 접근
		//잠고 Math클래스의 모든 field와 method는 static
		
		//Math.random은 Math클래스의 static메소드이다
		System.out.println(Math.random());	//인스턴트화 시키지 않아도 되는 메소드
		//Math.PI는 Math클래스의 클래스변수(=static변수)이다
		System.out.println(Math.PI);	//인스턴스화 시키지 않아도되는 변수를 클래스변수라고 한다.
		
		//(실행클래스에서 선언한)메소드 호출 =>메소드명();
		//인스턴스 메소드호출=>참조변수.메소드명()
		car1.abc();
		car1.qwe();
		
		//------------------------------------
		//static 변수명호출: 클래스명.변수명
		System.out.println("Car02.wheel="+Car02.wheel);
		
		System.out.println("car1.wheel="+car1.wheel);
		
		Car02 car2 = new Car02();
		Car02 car3 = new Car02();
		System.out.println("car2.wheel="+car2.wheel);
		//static으로 선언되어있기때문에 객체를 만들어서 접근할 순 있지만
		//클래스명.변수명 으로 호출
		System.out.println("car3.wheel="+car3.wheel);	
	}

}
