package ch07;

//DmbCellPhone01클래스를 사용하는 실행클래스
public class DmbCellPhone01_Ex01 {

	public static void main(String[] args) {
		DmbCellPhone01 dmbCP = new DmbCellPhone01("apple","white", 10);

		//필드출력
		//Cellphone01클래스로부터 상속받은 필드값 출력
		System.out.println("model="+dmbCP.model);
		System.out.println("color="+dmbCP.color);
		
		
		//DmbCellPhone01에서 선언한 필드값출력
		System.out.println("channel="+dmbCP.channel);
		
		
		//Cellphone01클래스로부터 상속받은 메소드호출
		//전원키고
		dmbCP.powerOn();
		//벨점검
		dmbCP.bell();
		//통화
		dmbCP.sendVoice("여보세요");
		//대답듣기
		dmbCP.receiveVoice("네");
		
		//DmbCellPhone01에서 선언한 메소드호출
		//dmb켜기
		dmbCP.turnOnDmb();
		//채널변경
		dmbCP.changeOnDmb(11);
		//dmb끄기
		dmbCP.turnOffDmb();
	}
}
