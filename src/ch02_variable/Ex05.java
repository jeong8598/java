package ch02_variable;

//타입 byte1<short2<int4<long8
public class Ex05 {

	public static void main(String[] args) {

		int v = 10;
		long v0 = 10;	/*겉으로는 문제없어보이지만 i n t타입의 10을 long변수타입에 넣은 것
							*=>i n t형데이터를 long타입변수로 자동형변환
							*/
		
		//long 타입변수를 초기화할 때는 정수값 뒤에 소문자l 또는 대문자L을 붙일수 있다
		//4byte 정수 데이터가 아니라 8byte 정수데이터임을 알려준다
		//i n t타입의 저장범위를 넘어서는 큰 정수에서는 l,L을 붙여야한다->우주, 은행권 업무
		long v1 = 10L;
		long v2 = 10l;	//
		
		//-----------------------------------------------------------------------
		//자동형변환 : 작은 크기타입이 큰 크기타입으로 저장될때.
		
		byte b1 = 10;
		int i1= b1;							//byte 타입 b1이 i n t형으로 자동형변환
		System.out.println("i1="+i1);	//10
		
		char c1 = '가';
		i1 = c1;								//char 타입 c1이 i n t형으로 자동형변환
		System.out.println("i1="+i1);	//44032
		
		i1 = 500;
		long l1 = i1;						//int->long
		System.out.println("i1="+i1);	//500
		
		i1 = 200;
		double d1 = i1;					//int->double
		System.out.println("i1="+i1);	//200
		
		
		//------------------------------------------------------------------------
		//강제형변환 : 큰크기타입의 데이터를 작은크기타입으로 저장될 때
		//	작은타입변수=(강제형변환변수)변수;
		//	값의 손실이 발생될 수 있으므로 주의.
		
		int i2 = 44032;
		char c22 = (char) i2;
		System.out.println("i2="+i2);			//44032
		System.out.println("c22="+c22);		//가
		
		long l22 = 500;
		i2 = (int)l22;
		System.out.println("i2="+i2);			//500
		
		double p = 3.14;
		float f=(float)p;
		System.out.println("p="+p);			//3.14
		System.out.println("f="+f);			//3.14
		
		i2 = (int)p;
		System.out.println("i2="+i2);			//3 값의손실 발생 
		
		float a = -10;		//정수값을 float타입변수에 할당(자동형변환)
		//음수 10.0을 정수변수에 할당?
		//int a1 = -10.0; //cannot convert from double to int
		int a2 = (int)-10.0;		//강제형변환
		double a3 = -10.0;		//double타입 값을 double형 변수에 할당
		float a4 = (float)-10.0;	//double타입값을 float타입으로 강제형변환
		a4= -10.0F;		//리터럴형변환
		
		//1byte>2short,2char>4int>8long>4float>8double
				
		//
		
	}

}
