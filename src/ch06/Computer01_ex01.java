package ch06;

//매개변수의 개수를 모를 때의 메소드 사용법
public class Computer01_ex01 {

	public static void main(String[] args) {
		
		Computer01 com = new Computer01();
		
		
		//배열변수를 미리준비해서 사용하는 방법
		int[] values = {1,2,3};	//배열변수 선언
		int result = com.sum(values);	//메소드호출 방법1
		System.out.println( "com.sum(values)="+result);
		
		//-----------------------------------------------------
		//배열을 미리 생성하지 않고 메서드호출시 넘겨준다
		//메소드호출시 넘겨준 값의 수에 따라서 자동으로 배열이 생성되고 매개값으로 사용된다
		int result1 = com.sum(new int[]{1+2+3});	//메소드호출 방법2
		System.out.println("com.sum(new int[]{1+2+3})="+result1);
		
		int result2 = com.sum1(1+2+3);	//메소드호출 방법3
		System.out.println("com.sum1(new int[]{1+2+3})="+result1);
		
		int result3 = com.sum1(values);	//메소드호출 방법2
		System.out.println( "com.sum1(values)="+result3);
	}

}
