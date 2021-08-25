package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet01 {

	public static void main(String[] args) {
		//HashSetset = new HashSet();
		HashSet<String> set = new HashSet<String>();
		
		
		//객체를 추가
		set.add("홍길동");
		set.add("henry");
		set.add("유재석");
		set.add("김구");
		set.add("강호동");
		set.add("홍길동");	//중복을 허용하지 않는다.
		
		set.iterator();
		//저장된 객체의 총 수를 조회
		System.out.println("저장된 객체의 총 수="+set.size());
		System.out.println();
		
		//객체 꺼내기(조회)
		
		
		
		//객체 꺼내기(조회)-	List에서는	Object	get(int index)
		//							Set에서는	Iterator iterator()
		//
	
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {	//다음 요소(객체)가 존재하는 동안 =>객체수만큼 반복
			Object element = iter.next();	//Object next() : 다음 요소(객체)를 가져와 Returns the next element in the iteration
			//System.out.println(element);
			System.out.println((String)element);	//결과는 같음
		}
		System.out.println();
		
		
		//객체 삭제 remove(Object)
		set.remove("김구");	//김구삭제
		set.remove("강호동");
		
		System.out.println();
		//향상된 for문이용 - 모든 데이터 꺼내기
		//for(타입 변수 : 배열명 또는 컬렉션명) {}
		
		for(Object obj : set) {
			System.out.println(obj);
		}
		
		//모든객체 제거하고 비운다
		set.clear();
		System.out.println("저장된 객체의 총 수="+set.size());	//0
		
		//Returns true if this set contains no elements.
		if(set.isEmpty()) System.out.println("비어있어요");
		
		
		
		
		
	}
}
