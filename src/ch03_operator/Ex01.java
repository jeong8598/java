package ch03_operator;

//부호연산자 - [java의 정석]
public class Ex01 {

	public static void main(String[] args) {

		int x = -100;
		int result = -x;	//단항연산자
		System.out.println("result="+result);	//100
		int result1 = +x;	//단항연산자
		System.out.println("result="+result);	//-100
		
		short s = 100;
		//short result2 = -s;	//컴파일에러발생cannot convert from int to short
		//주의. 부호연산자의 산출타입은 int가 된다.
		short result2 = (short)-s;
		int result3 = -s;
		System.out.println("result2="+result2);	//-100
		
		System.out.println("--------------------------------------");
		
		//-----------------------------------------------------------------------------
		//논리부정연산자(!)
		//true->false false->true
		
		boolean play = true;
		System.out.println("play="+play);	//true
		
		play = !play;
		System.out.println("play="+play);	//false
		
		if(play) {
			System.out.println("if문안에play="+play);		//true
		}
		play = !play;
		System.out.println("play="+play);	//false
		
		if(!play) {	//false의 반대인 true가 되면서 if조건이 충족되면
			System.out.println("if문안에play="+play);	//false	//play값을 출력해라
		}
	
	
	}

}
