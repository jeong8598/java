package ch07;

//person01 클래스로 부터 객체를 생성하여 실행하는 클래스
public class Person01_ex01 {

	public static void main(String[] args) {
		//객체 생성
		Person01 p = new Person01("801123-1234567", "홍길동");
		//Person01클래스에는 String타입 2개를 파라미터로 가진 생성자를 가지고 있으므로
		//기본생성자는 사용할 수 없다
		//Person01 p = new Person01();	//Person01 cannot be resolved to a type
		
		
		//필드 3개의 값 출력
		System.out.println("p.nation="+p.nation);
		System.out.println("p.snn="+p.snn);
		System.out.println("p.name="+p.name);
		
		//필드 3개의 값 변경
		//여기에서 nation은 변수를 선언하면서 초기값이 저장되었고
		//여기에서 ssn은		객체를 생성하면서 argument값으로 초기값이 저장되었으로
		//프로그램을 실행하는 도중에 변경x
		//p.nation="대한민국";
		//p.snn="801123-234567";
		p.name="홍의적";
				
	}

}
