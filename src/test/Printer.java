package test;

public class Printer {
		//comment: field의 문법은 [접근제어자]	[속성]	데이터타입	변수명[=초기값]; 이예요
		//[접근제어자]	[속성]	데이터타입	변수명();
		int i;
		boolean b;
		double d;
		String s;
		
		
		//[접근제어자]	[속성]반환타입 메서드명(){}
		public void println(int i) {
			System.out.println(i);
		}
		
		public void println(boolean b) {
			System.out.println(b);
		}
		
		public void println(double d) {
			System.out.println(d);
		}
		
		public void println(String s) {
			System.out.println(s);
		}
		
	}