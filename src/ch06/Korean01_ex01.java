package ch06;


//Korean01클래스의 객체를 생성하여 실행하는 클래스
public class Korean01_ex01 {

	public static void main(String[] args) {
		//Korean01클래스로부터 객체생성
		Korean01 k1 = new Korean01();
		
		//필드값을 출력
		/*System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		System.out.println(k1.age);
		*/
	
		//매개변수 한개짜리 생성자 호출
		//매개변수 타입, 개수, 순서에 맞는 생성자가 자동으로 호출된다
		Korean01 k2 = new Korean01("홍길동");
		Korean01 k3 = new Korean01(10);
		//매개변수 2개짜리 생성자 호출
		Korean01 k4 = new Korean01("희동","921005-1234567");
		//매개변수 3개짜리 생성자 호출
		Korean01 k5 = new Korean01("둘리","941005-1234567",27);
		
		//이름개명하기 k2 
		k2.setName("김아무개");
		
		//이름가져오기
		String n = k2.getName();
		System.out.println(n);
	}
	
	

}
