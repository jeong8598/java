package ch11;

import java.util.ArrayList;

/*컬렉션 프레임웍의 핵심 인터페이스- 중요★★★★★	- 교재p578
 *List - 순서유지, 중복허용			예)대기자목록
 *Set  - 순서유지x, 중복허용x
 *Map  - key,value가 한 쌍으로 구성
 				  순서유지x, key는 중복허용x, value은 중복허용 
*/

//ArrayList클래스 - 교재p584
public class ArrayList01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		
		//객체를 추가
		list.add("홍길동");
		list.add("henry");
		list.add("유재석");
		list.add("김구");
		list.add("강호동");
		list.add("홍길동");	//중복된 데이터 추가할 수 있다 =>중복 허용
		
		//저장된 객체의 총 수를 조회
		int length = list.size();	//Returns the number of elements in this list.
						//element요소- 대문자E로 표현하기도 함
		
		System.out.println("저장된개체의 총 수 "+ length);	//저장된개체의 총 수 5
		
	
		//객체 꺼내기(조회)
		//System.out.println(list.get(0));	//Object java.util.ArrayList.get(int index) 리턴유형 Object
		Object obj = list.get(0);
		System.out.println(" list.get(0);"+obj);//홍길동
		System.out.println(" list.get(0);"+(String)obj);//홍길동
		//클래스(강제)형변환 :( sub클래스명)
		//참조변수의 형변환 - 교재 357참고
		
		
		//모든객체 꺼내기=입력한순서대로 출력됨
		for(int i=0; i< length;i++) {
			System.out.println(" list.get("+i+")="+(String)obj);
		}
		System.out.println("------------------------");
		//특정인덱스에 있는 객체 삭제remove(index)
		list.remove(2);	//유재석제거
		list.remove(2);//김구제거
		
		//특정 인덱스에 있는 객체 삭제:remove(Object)
		list.remove("홍길동");
		
		System.out.println("------------------------");
		//향상된 for문이용 - 모든 데이터 꺼내기
		//for(타입 변수 : 배열명 또는 컬렉션명) {}
		for(Object temp : list) {
			System.out.println((String)temp);
		
			
		}

	}
}
