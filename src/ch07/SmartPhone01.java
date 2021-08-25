package ch07;

//Smartphone01은  Phone01의 실체클래스이므로
//Phone01생성자를 호출해야한다. 
//Implicit super constructor Phone01() is undefined for default constructor.
//Must define an explicit constructor
public class SmartPhone01 extends Phone01 {
	
	
	//constructor
	public SmartPhone01(String owner) {
		super(owner);	//부모클래스의 생성자 호출
	}

	//method
	public void internet() {
		System.out.println("인터넷사용");
	}
	
	
}
