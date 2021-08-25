package ch07;

//import java.util.Date;	//import 패키지명.클래스명;
//import java.util.Random;	//util패키지안에 random클래스만을 import한다
import java.util.*;			//util패키지에 속한 모든 클래스를 import한다
									//util패키지안의 하위 패키지의 클래스는 제외한다
									//->java.util.concurrent 패키지안의 클래스는 제외


//package와 import
//import 단축키 ctrl+shift+o

//상위클래스=부모클래스=조상클래스=super클래스
//하위클래스=자식클래스=자손클래스

//상속문법> 하위클래스명 extends 상위클래스
//public class Ex01 extends Object {		//묵시적으로 Object클래스를 상속받고 있다.
	public class Ex01{	
	public static void main(String[] args) {
		//Date today = new java.util.Date();	//클래스의 실제이름은 (fullname)은 패키지명을 포함
		Date today = new Date();//import 하지 않으면 컴파일에러발생
		System.out.println("today="+today);
		
		System.out.println(new Random().nextInt());
		
		new java.util.concurrent.atomic.AtomicBoolean();
		//new AtomicBoolean(); 컴파일에러
		
		

		Ex01 e1 = new Ex01();
		Ex01 e2 = new Ex01();
		//모든클래스의 최고조상클래스는 Object클래스이다.
		//따라서 모든클래스는 Object클래스가 가진 메소드를 사용할 수 있다.
		//equals()메소드의 문법> 참조변수.equals(Object Obj)
		//Ex01클래스를 각각new해서 참조변수 e1와 e2에 주소를 할당하였다.
		//객체는 new할 때마다 서로 다른 주소지가 생기므로
		//참조변수 e1과 e2에 저장된 주소는 다르므로
		//2개의 참조변수의 주소가 같은지(equals)비교하니 false가 나왔다.
		System.out.println(e1.equals(e2));	//false
	}

}
