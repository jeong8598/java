package ch03_operator;

//비교연산자 - 슬라이드 21참조
/*	a>b a는 b보다 크다				초과
 * a>=b	a는 b보다 크거나 같다		이상
 * a<b b는 a보다 크다				미만
 * a<=b a는 b보다 작거나 같다.		이하
 * a==b	a는 b와 같다.				동일
 * a!=b	a는 b와 같지않다.
 */
//비교연산자에서는 연산을 하기전에 피연산자의 타입을 일치시킨다/
public class Ex05 {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'B';
		//'A'가 int 타입 65로 변환
		//'B'가 int 타입 66로 변환
	
		System.out.println("c1<c2의결과=" +(c1+c2));	//true
	}

}
