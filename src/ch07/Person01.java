package ch07;

/*final -마지막,최종적
 * final 필드 -> 초기값이 저장되면 최종적인 값이 된다 => 프로그램을 실행하는 도중에 변경할 수 없다.
 */

//사람
public class Person01 {
	//field	[접근제한자][속성] 데이터타입 변수명[=초기값];
	 
	final String nation = "korean";	//국적.		여기에서는 객체마다 공통적인 값을 가지므로 초기값을 부여함
	final String snn;						//주민번호	여기에서는 객체를 생성할 때마다 별도의 다른 값을 가지므로 초기값x
	String name;					//이름
	
	
	//constructor[접근제한자] 클래스명(매개변수리스트){}
	//Person01(){}	//컴파일에러, 생성자는 final필드의 최종 초기화를 마쳐야 하는데 그렇지 않아서 에러발생
	//The blank final field snn may not have been initialized
	 Person01(String snn, String name){
		this.snn = snn;
		this.name = name;
	}
	
	//method[접근제한자][속성] 리턴유형 메서드명(매개변수리스트){}
}
