package ch03_operator;

public class Ex03 {

	public static void main(String[] args) {
		double pi = 3.14;
		pi=1.123;
		pi=-1.12;
		
		System.out.println("Math.PI"+Math.PI);
		//Math.PI=1.123;//The final field Math.PI cannot be assigned
		float r1 = Math.round(Math.PI);	//math.round 결과는 long타입변수
		System.out.println("r1="+r1); //3.0 float변수에 넣었으므로
		
		
	}

}
