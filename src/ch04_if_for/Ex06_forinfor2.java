package ch04_if_for;

//가변인자 - 교재287참고
public class Ex06_forinfor2 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			for(int j =0; j<3;j++) {
				System.out.print("  ["+i+","+j+"]");
			}System.out.println();
		}
		
		for(int i=0;i<5;i++) {
			for(int j =0; j<3;j++) {
				//printf():가변인자를 가진 메소드
				//System.out.printf(String타입의 format, Object타입의 args);
				System.out.printf("[%d,%d] %s  ",i,j,"님");
				//System.out.print("  ["+i+","+j+"]");
			}System.out.println();
			
		}
		
	}

}
