package ch02_variable;

//연산식에서 자동타입변환
public class Ex06 {

	public static void main(String[] args) {
		//정수 1byte<2short,2char<4int<8long
		//실수 4float<8double
		//정수<실수
		//1byte<2short,2char<4int<8long<4float<8double
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2;		//컴파일에러발생 cannot convert from int to byte
		//int보다 작은타입(byte,short,char)이 연산에 사용되면 int로 자동형변환된다.
		int i1 = b1 + b2;	
		
		char c1 = 'A';
		char c2 = 1;
		//char c3 = c1 + c2; //컴파일에러발생 cannot convert from int to char
		int i3 =c1+c2;		//65+1
		System.out.println("i3="+i3);
		
		
		int i4 = 10;
		int i5 = i4/4;
		//	몫은 2.5로서 실수형이지만 정수int에 저장되면서 값손실 발생
		System.out.println("i5="+i5);		//2
		
		int i6 = 10;
		//int i7 = 10/4.0;	//정수와 실수가 연산식에서 만나면 (크기가 더 큰)실수가 됨. 컴파일에러발생 cannot convert from double to int
		//연산식에 실수리터럴이나 double타입이 있다면 다른 피연산자도 double타입으로 자동형변환이 됨.
		int i7 = (int) (10/4.0);
		double i8= i6/4.0;
		
		
		
	}

}
