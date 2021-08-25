package ch04_if_for;

//[Java의정석]ch4_조건문과반복문- 22슬라이드 참고
//자신이 포함된 반복문의 끝으로 이동한다.(다음 반복으로 넘어간다.)
//continue문 이후의 문장들은 수행되지 않는다.
public class Ex07_continue {
	
		public static void main(String[] args) {
			
			//break이용 0,1,2,3,4,5,for문밖
			for (int i=0; i<11; i++) {
				System.out.println("i="+i);
				if(i==5)
					break;
			}System.out.println("i==5일때-break");
			System.out.println("----------------------------");
			
			//0,1,2,3,4,5,6,7,8,9,10,for문밖
			for (int i=0; i<11; i++) {
				
				if(i==5) {
					//System.out.println("i==5일때-continue");
					continue; //지금진행하던것은 멈추고 다음 반복문을 진행해라=> for문에서 증감식으로 이동
				}System.out.println("i="+i);	
			}System.out.println("for문밖");
			
		}

}
