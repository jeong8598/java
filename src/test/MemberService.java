package test;

public class MemberService {
	String id;
	String password;
	
	MemberService(){}
	
	//method	[접근제어자][속성]리턴유형 메소드명 ([매개변수리스트]){}
	void login(String id,String password) {
		this.id=id;
		this.password = password;
		//comment: 문자열값(문자열모양)을 비교할 때에는 ==를 사용하지 않아요. 다른 방법을 찾아보세요
		//comment: 그렇다면 ==는 무엇이 일치하는지 비교할때 사용할까요? 정수타입
		if(id.equals("hong")&&password.equals("12345")) {			
			System.out.println("로그인되었습니다.");
			logout();
			return;
		}
		System.out.println("id 또는 password가 올바르지 않습니다.");
		return;
	}
	
	void logout() {
		System.out.println("로그아웃 되었습니다.");
	}
}

