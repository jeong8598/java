package ch04_if_for;
//반복문
//for 예측할수있는경우
//while 예측할수없는경우
//do-while 쿼리문을 실행하고 조건이 맞는지 확인
public class Ex06_for {

	public static void main(String[] args) {
		int j=0;
		for( ; ; ) {	//조건이없으면 true로 본다 //슬라이드16참고
			if(j<5) {
				System.out.println(j);
				j++;
			}else {
				break;//반복문을 종료시켜라
			//if밖 for안
		}
		
		}
		//구구단 2단 출력	2 * 1 = 2 ...2 * 10 =20
		for(int i=1; i<=10; i++) {
			System.out.println("2 * "+i+" = "+(2*i));
		}
		
		for(int i=1; i<=10; i++) {
			int dan = 2;
			int result = 2*i;
			System.out.println(dan+" * "+i+" = "+result);
		}
		
		int dan = 0;
		for(int i=1; i<=10; i++) {
			dan = 2;
			int result = 2*i;
			System.out.println(dan+" * "+i+" = "+result);
		}//문제없음. 아래의 쿼리에서도 dan을 사용가능
		
		// 5 4 3 2 1 ..1 출력
		for(int i=5; i>0; i--) {
			System.out.println("dan="+dan);//2 마지막에 입력해준 값으로 출력됨
			System.out.println("i="+i);
		}
		
		//1 2 3 ... 9 10까지 출력 
		
		/*for(int i=1; i<11; i++) {
		*	System.out.println("i="+i);
		*}
		*/
		System.out.println("------------------------------------");
		//0+1+2+3+4+5 합출력
		int sum = 0;	//누적된 합을 저장하기위해 선언한 변수
		for (int i = 0; i<=5; i++) {
			sum += i; //대입연산자 //sum = sum+i;	//0+0,0+1,1+2,3+3,6+4,10+5
			System.out.println("sum+1="+(sum));//0,1,2,3,4,5=>sum이 for문안에있을때 값
		}
		System.out.println("총합="+sum);
		
		
	}
}

