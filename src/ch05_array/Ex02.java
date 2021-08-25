package ch05_array;

//배열선언과 생성=>데이터타입에 다른 자동초기화
public class Ex02 {

	public static void main(String[] args) {
		//jumsu 5개를 저장하기 위한 배열변수 jumsu선언과 생성
		int jumsu[];
		jumsu = new int [5];
		
		for (int i=0;i<jumsu.length;i++) {
			System.out.println(jumsu[i]);
			}		//자동초기화=>여기서는 int타입은 0
		
		System.out.println("------------------------------------");
		double[] height = new double[5];
		for(int i=0;i<height.length;i++) 	{
			System.out.println(height[i]);
		}
		System.out.println("------------------------------------");
		//String타입 데이터3을 저장하기 위한 names배열변수 선언 후 출력
		String[] names = new String[3];
		for(String name:names) {
			System.out.println(name);	//String과 같은 클래스의 초기값은 null이다.
		}
}
}
