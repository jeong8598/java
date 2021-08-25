package ch07;

public class Cat01 extends Animal01{

	public Cat01() {
		this.type="포유류";
	}

	@Override
	public void move() {
		System.out.println("네발로 점프해요");
	}

	@Override
	public void sound() {
		System.out.println("엄마~하고 소리내요");
	}

}
