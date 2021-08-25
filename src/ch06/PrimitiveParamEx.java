package ch06;

public class PrimitiveParamEx {
/*메소드나 생성자안에 들어가는 변수를 매개변수라하고
 * 주소값이 들어가는 매개변수를 참조형 매개변수
 * 값이 들어가는 매개변수는 기본형 매개변수
*/
	public static void main(String[] args) {
		Data d = new Data(); 	//인스턴스(객체) 생성	//d에는 heap영역에 생성된 객체의 주소가 저장
		System.out.println("d.x = "+d.x);	//d.x=0
		d.x=10;
		System.out.println("변경후 d.x="+d.x);
		change(d.x);	//static함수는 static함수를 호출할 수 있다.
	}
	
	
	//Data 클래스의 인스턴스변수 x 의 값변경
	static void change(int x) {
		x=1000;
		System.out.println("change()호출성공 매개변수x=" +x);
		}
	}

class Data{
	int x;	// x=0;으로 자동초기화	//인스턴스변수
}