package ch05_array;

//배열의 활용
//5명 학생의 최고점수와 최소점수를  출력
/*출력결과
* 최고점수 : ~
* 최소점수 : ~
*/
public class Ex10_0 {

	public static void main(String[] args) {
		int[] score = {67,95,52,87,100};
		int s0 = score[0]; //int s0 = 100; 
		int s1 = score[1]; //int s1 = 90; 
		int temp = 0; //임시변수 선언
		System.out.println("s0="+s0); //100
		System.out.println("s1="+s1); //90
		
		//s0의 값과 s1의 값   교환
		temp=s0;  //temp=100;
		s0 = s1;  //s0 =90;
		s1 = temp;//s1 =100;
		
		System.out.println("변경후-------------------");
		System.out.println("s0="+s0); //90
		System.out.println("s1="+s1); //100
		
	/*	
		
		int s0 = 100;
		int s1 = 90;
		int temp = 0; //임시변수 선언
		System.out.println("s0="+s0); //100
		System.out.println("s1="+s1); //90
		
		//s0의 값과 s1의 값   교환
		temp=s0;  //temp=100;
		s0 = s1;  //s0 =90;
		s1 = temp;//s1 =100;
		
		System.out.println("변경후-------------------");
		System.out.println("s0="+s0); //90
		System.out.println("s1="+s1); //100
		*/
		
	}

}
