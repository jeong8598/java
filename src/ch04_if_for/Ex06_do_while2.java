package ch04_if_for;
//i가 5가되면 빠져나와라
//1234 do_while문 밖
/*if(조건){
*	반복문종료하고 빠져나와라
*/
 public class Ex06_do_while2 {


	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("i="+i);	
			i++;
			if(i==5) {
				break;
			}
			
		
		}while(i<11);
		
		System.out.println("do_while 밖");
		//1,2,3,4,do_while 밖
		
		
	}//main 끝

}
