package ch03_operator;

//문자열비교★★★★★
//== : 주소를 비교
//stack영역(개발자가 조작하는 영역)
//heap영역(개발자가 조작하지 못하는 공간)이 존재
//class를 통해 new새롭게 만든 객체는 주소를 참조변수에 저장하게 됨

//객체생성과 관련된 내용은 [java의 정석]ch6_1_r객체지향개념1.ppt 11슬라이드 참조
public class Ex06_star {

	public static void main(String[] args) {
		
		Ex06_star obj1 = new Ex06_star();				//같은 클래스에서 생성했지만 new를 사용하여 새로운 객체로 생성되었으므로 
		Ex06_star obj2 = new Ex06_star();
		System.out.println("obj1="+obj1);	//obj1=ch3.Ex06@9f70c54 저장된 주소출력
		System.out.println("obj2="+obj2);	//obj2=ch3.Ex06@234bef66
		
		
		String str1 = "홍길동";
		String str2 = "홍길동";	
		String str3 = new String("홍길동");	//str3=>참조변수(reference변수)
		String str4 = new String("홍길동");	//string 클래스에 대한 변수선언을 할 때 객체를 새로(new를 사용하여) 생성해주는게 일반적
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
		if(str1==str2) {	// 조건을  충족하면 실행
			System.out.println("str1과 str2는 일치한다.");	//문자열들간에 비교==는 주소지를 비교하는 것
		}else {	//조건이 참이 아닌 경우
			System.out.println("str1과 str2는 일치x.");
		}
		
		System.out.println("----------------------------------");
		
		//== 주소비교
		System.out.println("str3="+str3);
		System.out.println("str4="+str4);
		if(str3==str4) {	// 조건을  충족하면 실행
			System.out.println("str3과 str4는 주소가 일치한다.");
		}else {	//조건이 참이 아닌 경우
			System.out.println("str3과 str4는 주소가일치x.");
		}	
		//문자열.equals(비교문자열) 값비교
		if(str3.equals(str4)) {	// 조건을  충족하면 실행
			System.out.println("str3과 str4는 값이 일치한다.");
		}else {	//조건이 참이 아닌 경우
			System.out.println("str3과 str4는 값이 일치x.");
		}
		
		
		
		
		
		
	}

}
