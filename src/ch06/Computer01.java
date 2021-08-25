package ch06;

//매개변수의 개수를 모를 때의 메소드 선언과 사용법
public class Computer01 {

	//field		[접근제어자] 타입 참조변수명{}
	
	//constructor	[접근제어자] 클래스명([매개변수리스트]){}
	
	//method	[접근제어자] [속성] 리턴유형 메서드명 (매개변수리스트){}
	int sum(int[] values) {	//1,2,3
		int result = 0;//결과를 저장하는 변수선언
		//매개변수에 입력된 데이터를 이용 - 데이터를 입력input
		//구현:더하기계산
		for(int i =0;i<values.length;++i) {
			result += values[i];
		}
		//결과출력output
		return result;
		
	}

	//접근제어자 속성 리턴유형 메소드명(타입··· 매개변수명){}
	int sum1(int ... values){
		int result = 0;//결과를 저장하는 변수선언
		//매개변수에 입력된 데이터를 이용 - 데이터를 입력input
		//구현:더하기계산
		for(int i =0;i<values.length;++i) {
			result += values[i];
		}
		//결과출력output
		return result;
	}
}


