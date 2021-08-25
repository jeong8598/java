package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap01 {

	public static void main(String[] args) {
		
		//Map생성
		Map<String, Integer> map = new HashMap<String,Integer>();
		//Map map = new HashMap();
		
		//객체저장
		map.put("hong",10);	//key는	중복허용x하므로 저장x
		map.put("gil",50);
		map.put("dong",100);
		map.put("hong1",100);	//value는 중복허용하므로 객체저장
		map.put("hong",1234);	//key는	중복허용x하므로 기존값을 덮어버림
		
		System.out.println("총객체수="+map.size());
		
		//특정객체찾기 Object get(Object key)
		Integer x = map.get("hong");
		System.out.println("Integer x="+x);
		System.out.println(x.MAX_VALUE);
		
		/*참고
		//map.get("hong")하면 여기서는 Integer로 리턴받지만
		//int타입의 변수에 저장할 수 있는 이유는
		//auto unboxing이 되기 때문이다.
		int y= map.get("hong");
		System.out.println("Int y="+y);
		//x와 y는 단순히 값은 동일하지만
		x는 Integer에 있는 모든 메서드를 사용할 수 있는 클래스이고 
		y는 프리미티타입인 값만 가지는 변수 이다.
		*/
		
		//Map에 저장된 모든 객체 찾기
		//value를 가져오기 위해서는 먼저 key를 알아야 한다.
		//keySet() : 모든 key를 Set컬렉션으로 받을 수 있다.
		
		//방법1)
		//1.keySet()을 이용해서 Set컬렉션으로 받고
		Set<String> keys = map.keySet();	//=>리턴타입 String, 상위에서 key값을 지네릭스를 이용해 String으로 지정해주었기 때문에
		
		//2.Set컬렉션에서 제공되는 반복자를 통해 모든 key를 얻은 다음
		Iterator<String> iter = keys.iterator();
		
		//3.받은 개별 key를 이용해서 get()을 통해 값을 얻기
		while(iter.hasNext()) {
			//개별 key를 이용해서
			String key = iter.next();
			
			// get()을 통해 값을 얻기
			 Integer value = map.get(key);
			 System.out.println(key+" : "+value);
		}
		
		//특정 객체 제거
		map.remove("hong");
		System.out.println("특정객체 제거 후의 총 객체 수 = "+map.size());
		
		//방법2)
		//전체 객체 출력
		//Set<Entry<String, Integer>> entrySet() =>지네릭스를 지정했을때
		//Set									entrySet()	=>기본 Object타입 일때
		//1. map.entrySet();을 통해 Set컬렉션을 얻은 다음
		Set<Entry<String,Integer>> set = map.entrySet();
		
		//2. Set컬렉션에서 제공되는 반복자를 통해 Map.Entry를 하나씩 얻고
		Iterator<Entry<String,Integer>> iter1= set.iterator();
		
		while(iter1.hasNext()) {
			Entry<String, Integer> entry = iter1.next();
			//3. getKey()를 통해 key를
			String key = entry.getKey();
			//4. getValue()를 통해 value를 얻기
			Integer value =  entry.getValue();	//key값을 넣지 않아도 됨
			System.out.println(key+" : "+value);
		}
		
	}
}
