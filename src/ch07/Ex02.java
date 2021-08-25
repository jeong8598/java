package ch07;

//final 클래스
public class Ex02 extends Object{
	public static void main(String[] args) {
		Father02 f = new Father02();
		f.abc();
		Son02 s = new Son02();
		s.qqq();
		s.abc();	//Father02의 abc함수야
		//상속받은Father02클래스의 메소드 abc()를 호출할 수 있다.
		s.a=20;
		System.out.println(s.a);
		//Son022 s2 = new Son022();
		//s2.aaa();	//The method aaa() is undefined for the type Son022
		
	}
}
final class Father022{
	void aaa() {
		System.out.println("Father022의 aaa()");
	}
}
//class Son022 extends Father022{	//The type Son022 cannot subclass the final class Father022
	
//}
//[접근제어자] [속성] class 클래스명 [extends 부모클래스명]
class Father02{
	int a = 10;
	void abc(){
		System.out.println("Father02의 abc()함수야");
		System.out.println(a);
	}
}
class Son02 extends Father02{
	//void qqq() {abc();}
	void qqq(){
		System.out.println("Son02의 abc()함수야");
		
	}

	}

