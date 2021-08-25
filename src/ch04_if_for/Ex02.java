package ch04_if_for;

//조건문
/* 90이상	-	A등급
 * 80이상	-	B등급
 * 70이상	-	C등급
 * 60이상	-	D등급
 * 60미만	-	F등급	출력
 */
/*Math.random() : 0.0이상 1.0미만의 난수 발생
 * double타입/양수
 * Returns a double value with a positive sign,
 * greater than or equal to 0.0 and less than 1.0
 */

public class Ex02 {

	public static void main(String[] args) {
		double num = Math.random();
		System.out.println("Math.random="+num);
		//초과 gt
		//이상 gte
		//미만 lt
		//이하 lte
		System.out.println("Math.random="+(int)num);
		//0~5
		//Math.random()*(큰수-작은수+1)+작은수
		//(int)(Math.random()*(큰수-작은수+1)+작은수)
		System.out.println((int)(Math.random()*(5-0+1)+0));
		System.out.println((int)(Math.random()*(5-0+1)+0));
		System.out.println((int)(Math.random()*(5-0+1)+0));
		
		
			//임의점수값을 변수에 저장
		int score = (int)(Math.random()*(100-0+1)+0);		//임의점수값을 저장하기 위한 변수
		String grade="";	//등급을		 저장하기 위한 변수
		
		if(score>=90) {
			grade="A";
		}else if(score>=80) {
			grade="B";
		}else if(score>=70) {
			grade="C";
		}else if(score>=60) {
			grade="D";
		}else {
			grade="F";
		}
			
			System.out.println(score+"점은"+grade+"등급이다");
			
		
	
	}

}
