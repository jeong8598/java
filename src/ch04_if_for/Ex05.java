package ch04_if_for;

import java.util.Scanner;	//java.util 패키지안에 scanner클래스를 임포트하겠다.

/*가위(1), 바위(2), 보(3) 게임을 구현하세요
 * 컴퓨터:임의값 =>Math.random()이용
 * 유저:값을 입력 => Scanner클래스이용
 * 
 * 비교연산자/조건문 이용
 * 예)컴퓨터는 보를 내었습니다.
 * 		당신은 가위를 내었습니다.
 * 		귀하께서 이겼어요!
 * 교재 p40,510 참고
 */
public class Ex05 {

	public static void main(String[] args) {
		System.out.print("가위(1), 바위(2), 보(3) 중에 하나를 입력하세요.:");
		//클래스타입 변수(참조변수) = new Scanner();//instance객체를 생성 
		Scanner scanner = new Scanner (System.in); 
		int user = scanner.nextInt();	//콘솔을 통해 입력받은 데이터를 숫자형태로 받겠다.
		
		int com = (int)(Math.random()*(3-1+1)+1);	//컴퓨터의 값 임의설정
		
		System.out.println("컴퓨터는 "+user+"를 내었습니다.");
		System.out.println("당신은 "+com+"를 내었습니다.");
		
		//가위(1),바위(2),보(3)	가위1<바위2 바위2<보3 보3<가위1		
		
		switch(user-com) {
		case 2 : 
		case -1 : System.out.println("컴 win!"); break;
		
		case 1 : 
		case -2 : System.out.println("you win!"); break;
		case 0	: System.out.println("비겼어요"); break;
		
		
		
		
		}
	}

}
