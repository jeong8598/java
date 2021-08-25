package ch11.polymophism2;

public class Driver_ex01 {

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		driver.drive(new Vehicle());	//탈것이 움직여요
		
		//버스가 움직여요
		driver.drive(new Bus());
		/*Bus bus = new Bus();
		 *driver.drive(bus)
		 */
		//drive()메소드가 호출되면서 들어간 매개변수의 타입이
		//자동타입변환되었다.		Vehicle vehicle = new Bus();
		//자손클래스인 Bus에서 부모클래스Vehicle 의 run()를 오버라이딩하였으므로
		//Bus의 오버라이딩된 run()메서드가 호출된다
		
		//택시가 움직여요
		driver.drive(new Taxi());
		
	}
}



