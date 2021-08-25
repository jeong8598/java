package ch04_if_for;

//break
//21슬라이드 참고
//자신이 포함된 하나의 반복문 또는  switch문을 빠져나온다.
//주로 if문과 함께 사용해서 특정조건을 만족하면 반복문을 벗어나게 한다.
public class Ex07_break {

	public static void main(String[] args) {
		while(true) {	//무한출력하고 싶을때는 조건값을 true값으로
			int num = (int)(Math.random()*6)+1;
			//만족시 출력
			System.out.println("num="+num);
			if(num==5) {
				break;
			}
		}
		System.out.println("while 밖");	//여기에서는 프로그램 종료
		int count = 0;	//횟수를 저장하기 위한 변수
		while(true) {	//무한출력하고 싶을때는 조건값을 true값으로
			
			int num = (int)(Math.random()*6)+1;
			//만족시 출력
			System.out.println("num="+num);
			++count;	//1번 반복할 때마다 횟수가 1증가
			if(num==5) {
				break;
				
			}
			
		}System.out.println(count+"회");
		
	}//end of main

}
