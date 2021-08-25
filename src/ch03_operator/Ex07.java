package ch03_operator;

//논리연산자
//연산자 우선순위 산술 > 비교 > 논리 > 대입
//	T&T	=>결과 T
//	F&T	=>&앞의 결과가 false이더라도 뒤의 결과를 살펴본다
//	T&&T	=>결과 T
//	F&&T	=>&&앞의 결과가 false이면 결과는 무조건  false이므로 뒤의 결과를 보지 x(절삭연산자) 처리속도가 더 빠름,더효율적
public class Ex07 {

	public static void main(String[] args) {
		int charcode = 'Q'; //chr타입의 'A'를 int타입으로 넣었으므로 아스키코드 사용
		
		if(charcode>=65 & charcode<=90) {
			System.out.println("대문자야!");
		}
		
		if(charcode>=97 & charcode<=122) {
			System.out.println("소문자야!");
			
		}
		if(charcode>=48 & charcode<=57) {
			System.out.println("숫자야!");
		}
		
		
		int num = 3;
		
		if(num%2==0) {
			System.out.println(num+"은 2의 배수이군요!");
		}else {
			System.out.println("조건만족x");
		}
		
		if(num%2==0 || num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요!");
		}else {
			System.out.println("조건만족x");
		}
		
		if(num%2==0 | num%3==0) {
			System.out.println(num+"은 2 또는 3의 배수이군요!");
		}else {
			System.out.println("조건만족x");
		}
		
		
		
	}

}
