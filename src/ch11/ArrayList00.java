package ch11;

import java.util.ArrayList;

import ch07.Car01;

//모든 객체를 추가할 수 있다.
public class ArrayList00 {
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("문자열");					//String		=클래스
		list.add(1);							//int(=값)의 래퍼클래스인 Integer의 객체가 들어간 것
		list.add(true);						//boolean(=값)의 래퍼클래스인 Boolean
		list.add(Math.PI);					//double(=값)의 래퍼클래스인	Double
		list.add("A");						//char(=값)의 래퍼클래스인		Character
		list.add(new Car01());			//Car01		=클래스
		//클래스: 필드(속성)메서드(기능)로 구성 rap
		//출력
		//for( 데이터타입 변수명 : 배열명	또는 컬렉션명
		for(Object obj : list) {
			System.out.println(obj);
		}
		/*문자열
			1
			true
			3.141592653589793
			A
			ch07.Car01@15db9742
		 */
	}
}
