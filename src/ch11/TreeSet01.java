package ch11;

import java.util.TreeSet;

//TreeSet - 교재p
public class TreeSet01 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		//ts.add(1)); 오토박싱
		ts.add(new Integer(10));
		ts.add(new Integer(33));
		ts.add(new Integer(100));
		ts.add(new Integer(99));
		ts.add(new Integer(5));
		
		Integer num = null;	//num은 (메서드 안에있는) 지역변수라 자동초기화 되지 않으므로 null로 초기화 시킴
									//클래스 참조변수는 초기화를 null로 시킴
		System.out.println("가장 낮은 점수="+ts.first());	//5
		System.out.println("가장 높은 점수="+ts.last());		//100
		
		//lower,higher
		num = ts.lower(new Integer(20));	//10
		System.out.println("20보다아래인 수="+num);
		num = ts.higher(new Integer(90));	//99
		System.out.println("90보다 위인 수 ="+num);
		
		//floor,ceiling
		num = ts.floor(new Integer(99));	//내림
		System.out.println("99와 동일하거나 바로 아래 점수"+num);	//99
		num = ts.ceiling(new Integer(99));	//내림
		System.out.println("99와 동일하거나 바로 위 점수"+num);	//99

		while( !ts.isEmpty() ) {
			num = ts.pollFirst();			
			//ts.pollFirst():Retrieves and removes the first (lowest) element, 
			//or returns null if this set is empty.가장 낮은 수를 꺼내고 지워주거나 없으면 을 null출력
			System.out.println(num+"\t남은객체수:"+ts.size());
		}
		
	}
	/*인터페이스 
	 * 형식)
	 * interface 인터페이스이름{
	 * public static final 타입 상수명=초기값;
	 * public abstract 메서드명(매개변수리스트)
	 * }
	*자바는 단일상속을 지원하므로 인터페이스를 활용
	*생성자가 없음 상수와 추상메서드만 존재함.
	*추상메서드( 껍데기만 있는것, 기능이없음{}바디가 없음) -추상메서드 오버라이딩
	*미리 정해진 규칙에 맞게 구현하도록 표준을 제시
	*인터페이스도 클래스처럼 상속 가능(클래스와 달리 다중 상속 허용) extends대신 implements를 사용
	*/

}
