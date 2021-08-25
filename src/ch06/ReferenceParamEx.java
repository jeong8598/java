package ch06;

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data1 d = new Data1();	//d는 heap 영역에 생성된 객체의 주소가 저장된 참조변수
		System.out.println("참조변수 d="+d);
		d.x=10;//참조변수 안에 저장된 주소를 참조(Reference)하여 해당 클래스의 필드, 메소드를 접근할 수 있다.
		System.out.println("change()호출 전 d.x="+d.x);
		
		change(d);//함수호출
		System.out.println("change()호출 후 d.x="+d.x);
	}

	static void change(Data1 a) {
		System.out.println("change(Data1 d)" +a);
		a.x=1000;
		System.out.println("change()호출성공 참조매개변수 a.x="+a.x);
	}

}

class Data1{
	int x ;	//인스변수
}