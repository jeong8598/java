package ch04_if_for;

//do-while
//블럭{}이 최소한 1번 이상 수행될 것을 보장한다.
/*do{
 * 	//반복실행코드
 * }while(조건)
 */
public class Ex06_do_while {

	public static void main(String[] args) {

		int i = 0;
		do {
			System.out.println("i="+i);	//조건을 충족하지않아도 1번은 실행된다.
		}while(i>5);
		System.out.println("---------------------");
		
		//1,2,3,4,5 출력
		do {
			++i;
			System.out.println("i="+i);	
		}while(i<5);
		
	}

}
