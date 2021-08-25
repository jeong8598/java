package ch04_if_for;

//중첩for문 - 슬라이드 17참고
//
public class Ex06_forinfor {

	public static void main(String[] args) {
		
		//2~9까지 출력
		for(int i=2 ; i<10 ; i++) {
			System.out.println("i="+i+"단");
			
			for(int j=1; j<10 ; j++) {
				System.out.println("\t "+i+" * "+j+" = "+(i*j));
			}//내부for문
				
			System.out.println();
		}//외부for문
		
		for(int i=0;i<5;i++) {
			for(int j =0; j<5;j++) {
				System.out.print("["+i+","+j+"]");
			}
		
		
		}
	}

}
