package jdbc;

import java.util.Scanner;

public class R {

	public static void main(String[] args) {
	
		for(int i= 1;i<=10;i++) {
			System.out.println(i);
		}
		double pi = Math.PI;
			System.out.println("pi = "+pi);
			System.out.println(Math.round(pi));	//3
			System.out.println(Math.round(pi)*100);
			//소수점 3번째 자리에서 반올림 하여 2째자리까지 출력
			System.out.println(Math.round(pi*100)/100.0);
			//소수점 4번째 자리에서 반올림하여 3째자리까지 출력
			System.out.println(Math.round(pi*1000)/1000.0);
			
			Scanner sc = new Scanner(System.in);
			//더 활용을 많이 한다 String을 받고 int로 변환
			System.out.print("입력:");
			String str = sc.nextLine();	// String값으로 입력값을 받는다.
			int n = Integer.parseInt(str);		//String을 int로 변환
			System.out.println(n+1);
			System.out.println("----------------------------");
			
			
			System.out.print("입력:");
			int s = sc.nextInt();	//입력받은 String을 int로 변환
			System.out.println(s+1);
			
			for(int i= 1;i<=10;i++) {
				System.out.println(i);
			}
			
			
	}


}
