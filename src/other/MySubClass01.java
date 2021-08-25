package other;

//동일패키지 안의 부모클래스인 MyClass01에서 선언된 필드에 접근할 수있는지 확인
//[접근제어자] [속성] class 클래스명 [extends 부모클래스명]{}
class MySubClass01 extends MyClass01{
	void qqq() {
		MyClass01 m = new MyClass01();
		m.pub	=	100;
		m.pro	=	200;
		m.pack	=	300;
		//m.pri		=	400;
		
		//pri필드는 동일클래스에서만 접근가능. 외부클래스에서 접근불가
		//컴파일에러
		//The field MyClass01.pri is not visible
		
	}
}
