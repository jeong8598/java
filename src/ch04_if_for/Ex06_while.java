package ch04_if_for;
//while문
public class Ex06_while {

	public static void main(String[] args) {
		int	 i=0;
		while(i<5) {
			//조건만족시 반복실행코드
			i++;
			System.out.println("i="+i);//1,2,3,4,5
		}
		System.out.println("밖");
		System.out.println("-----------------------------");
		int i2=0;
		while(i<5) {
			//조건만족시 반복실행코드
			System.out.println("i2="+i2);//1,2,3,4,5
			i++;
		}
		System.out.println("밖");
		System.out.println("-----------------------------");
		
	}

}
