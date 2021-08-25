package ch11;

import java.util.HashSet;
import java.util.Set;

//MemberDTO_02객체를 중복없이 HashSet을 이용하여 저장하는 클래스
public class HashSet02_ex {

	public static void main(String[] args) {
		
		MemberDTO_02 m1 =new MemberDTO_02("홍길동", "801123-123456");
		MemberDTO_02 m2 =new MemberDTO_02("홍길동", "801123-123456");
		
		//Person01 p2 = new Person01("820123-222222","김길동");
		//System.out.println("m1.equals(m2)의 결과"+m1.equals(p2));
		
		
		//m1(기준값)이 매개변수m2와 동일하니?
		System.out.println("m1.equals(m2)의 결과"+m1.equals(m2));
		
		
		//다형성 구현,조상클래스명 참조변수명 = new 자손클래스();
		//HashSet hs = new HashSet();
		/*Set<MemberDTO_02> set = new HashSet<MemberDTO_02>();
		set.add(new MemberDTO_02("홍길동", "801123-123456"));
		set.add(new MemberDTO_02("김길동", "820123-222222"));
		set.add(new MemberDTO_02("홍길동", "801123-123456"));	//중복
		
		System.out.println("총 객체의 수 = "+set.size());	//3
		*/
	}

}
