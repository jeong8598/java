package ch11.polymophism2;

//이 클래스의 super클래스는 Vehicle
public class Taxi extends Vehicle{

	@Override
	public void run() {
		System.out.println("Taxi가 움직여요");
	}

}
