package ch03_operator;

//연결연산자 +
//문자열과 숫자가 혼합된 +연산식은 	왼쪽에서 오른쪽으로 연산이 진행
//문자열화된다.
public class Ex04 {

	public static void main(String[] args) {
		System.out.println("JDK "+8.0);	//"JDK "문자열 + "8.0"문자열 -> "JDK 8.0" 문자열
		
		String str = "JDK" +3.0+5.0;	//"JDK "+"3.0"+5.0"->"JDK3.05.0"
		//문자열 뒤에 +연결연산자가 나오면 뒤에있는 숫자들도 모두 문자열이 됨
		System.out.println(str);	//JDK 3.05.0
		
		System.out.println( "JDK " +(3.0+5.0));	//"JDK "+(8.0)->"JDK 8.0"
		System.out.println( 3.0+5.0+"버전");	//8.0+"버전"->"8.0"+"버전"->"8.0버전)
	
	}

}
