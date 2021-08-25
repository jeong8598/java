package ch11;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet이용 정렬에 특화된 인터페이스

//PersonDTO에서 재정의된 compareTo()메서드를 이용하여
//나이순으로 정렬하는 클래스이다.
//사용자(개발자) 정의객체를 나이순으로 정렬
public class PersonDTO_ex {

	public static void main(String[] args) {
		//TreeSet준비
		TreeSet<PersonDTO> ts = new TreeSet<PersonDTO>();
		
		//PersonDTO객체 추가
		//저장될 때 나이순으로 정렬됨
		ts.add(new PersonDTO("홍백", 100));
		ts.add(new PersonDTO("홍일", 1));
		ts.add(new PersonDTO("홍이", 2));
		ts.add(new PersonDTO("홍삼", 3));
		ts.add(new PersonDTO("김이백", 200));
		
		//왼쪽 마지막노드에서    오른쪽마지막노드까지    반복해서 가져온다=>오름차순
		//참고  - 이진 검색 트리는 부모보다 작은 값을 왼쪽에, 큰 값은 오른쪽에 저장
		Iterator<PersonDTO> iter = ts.iterator();
		while(iter.hasNext()) {
			PersonDTO person = iter.next();
			System.out.println(person.toString());
		}
		
	}

}
