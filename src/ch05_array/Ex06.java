package ch05_array;


//사용자 입력받기 -  커맨드라인을 이용하면
//프롬프트창에서 실행할 때는 >java Ex06 홍의장군 123 "hellow world"
//eclipese 에서 실행시에는 >run configuration의 arguments탭에서 
//홍의장군 공백입력 123" hellow world"입력
//홍의장군 enter 123 enter "helow world" 입력
  				//=>공백이포함된 문자열을 "큰따옴표"로 묶어야함
public class Ex06 {

	public static void main(String[] args) {//메서드=>진입함수
		System.out.println("args[]"+args[0]);
			//=>Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
		//배열의 범위를 넘어섰다.
		System.out.println("args[]"+args[1]);
		System.out.println("args[]"+args[2]);
		
		System.out.println("--------------------------");
		
		//함수호출 : 함수명(); p.254
		showMsg();
		showMsg("이순신");
		showMsg("유관순","대한독립 만세~!");
	}//main 밖
	
	
	//메소드(함수) 선언 p.252
	//함수4개중 2개 배움
	//메소드 오버로딩(overloading - 교재 p283)
	
	public static void showMsg(String name, String Msg) {	//메소드안과밖을 연결해주는 매개변수
		System.out.println(name+"님의 메세지는"+Msg);
	}
	
	
	
	public static void showMsg(String name) {	//메소드안과밖을 연결해주는 매개변수
		System.out.println(name+"님 환영해요!");
	}
	
	public static void showMsg() {
		System.out.println("showMsg()메소드 호출성공!");
	}
}
