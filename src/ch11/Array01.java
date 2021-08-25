package ch11;

//배열(Array) : 하나의 변수에 여러개의 데이터를 연속적으로 모아놓았다.
public class Array01 {

	public static void main(String[] args) {
		//문자열 5개를 저장하는 배열 생성
		String[] list = new String[5];
		//문자열 데이터 추가
		list[0] = "홍길동";
		list[1] = "henry";
		list[2] = "유재석";
		list[3] = "김구";
		list[4] = "강호동";
		//데이터의 개수를 조회
		System.out.println("저장된 데이터의 총 개수"+list.length);
		
		//데이터를 꺼내기(조회)
		System.out.println(list[0]);
		
		//모든데이터 꺼내기
		for(int i=0 ; i<list.length ; i++) {
			System.out.println("list["+i+"]="+list[i]);
		}
		//향상된 for문이용 - 모든 데이터 꺼내기
		//for(타입 변수 : 배열명 또는 컬렉션명) {}
		for(String temp : list) {
			System.out.println(temp);
		}
}
}