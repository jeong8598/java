package ch03_operator;

//	A학점 : 100~91
//	B학점 : 90~81

//삼항연산자 (조건)?참값:거짓값; -> if(조건){참값}else{거짓값}
//조건1? 조건1참값:(조건2)? 조건2참값:거짓값
public class EX08 {

	public static void main(String[] args) {
		//임의 숫자를 변수 score 변수에 저장
		//100~91이면 A학점, 90~81이면 B학점
		
		int score = 90;
		
		if(score>=91 && score<=100) {
			System.out.println("A학점입니다.");
		}
		if(score>=81 && score<=90) {
			System.out.println("B학점입니다.");
		}
		
		System.out.println("-----------------------------------");
		
		String result = score>=91 ? "A학점":(score>=81?"B학점":"그외");
		System.out.println(score+"점은 "+result);
		
		System.out.println("-----------------------------------");		
		
		if(score>=91 && score<=100) {
			System.out.println("A학점입니다.");
		}else if(score>=81 && score<=90) {
			System.out.println("B학점입니다.");
		}else if(score>=71 && score<=80) {
			System.out.println("C학점입니다.");
		}else System.out.println("기타");
		
	}

}
