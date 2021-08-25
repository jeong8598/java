package ch05_array;


//배열변수생성과	값할당
//방법1.	생성후        값을	할당
//방법2.	생성하면서 	값을	할당
public class Ex03 {
	public static void main(String[] args) {
		//방법1.	생성후        값을	할당
		int[]	nums	=	new	int[3];
		nums[0]	=	10;	//인덱스번호에	0에	10을	할당
		nums[1]	=	20;
		nums[2]	=	30;
		
		for(int num:nums) {
			System.out.println(num);
		}
		
		//방법2.	생성하면서 	값을	할당
		//문법	데이터타입[] 배열변수명 = {초기값 , ... , 초기값}
		//문법	데이터타입[] 배열변수명 = new 테이터타입 [] {초기값 , ... , 초기값}
		//char[] c = new char[] {'a','b','c'}; 또는 char[] c = {'a','b','c'};
		//char[] c = new char[3] {'a','b','c'};	//=>컴파일에러
		//Cannot define dimension(크기) expressions when an array initializer(초기화) is provided
		//초기값을 제공하면서 배열크기를 명시하지x
		char[] c = {'a','b','c'};
		for(char temp:c) {
			System.out.println(temp);
		}
		
		
		
		
	}
}
