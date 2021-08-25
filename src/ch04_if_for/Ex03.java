package ch04_if_for;

//switch문 : ==비교연산자만 사용, 그외 다른 비교연산자사용X(예)> >= < <= !=
public class Ex03 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6+1); //1~6까지의 수
	//주사위를 던져서 나온 수를 출력하세요
		System.out.println(num);	//메소드나 문법 외부와 내부를 연결시켜주는 변수:매개변수
		switch(num){
			case 1 :	
				System.out.println("1이 나왔어요"); break;	//'1' char타입 1 "1"문자1
			case 2 :
				System.out.println("2가 나왔어요"); break;
			case 3 :
				System.out.println("3이 나왔어요"); break;
			case 4 :
				System.out.println("4가 나왔어요"); break;
			case 5 :
				System.out.println("5가 나왔어요"); break;
			case 6 :
				System.out.println("6이 나왔어요"); break;
		}
		
	}

}
