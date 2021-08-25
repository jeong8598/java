package ch07;

//상수(static final)
public class Earth_ex01 {

	
	public static void main(String[] args) {
	System.out.println("지구의반지름"+Earth.EARTH_RADIUS);
	System.out.println("지구의표면적"+Earth.EARTH_SURFACE_AREA);
	}
}
//상수는 모두 대문자로 작성하는 것이 관례. 혼합된 이름이면 _ 로 결합
//초기값이 단순값이라면 선언시에 최기값을 제시하는 것이 일반적
//복잡한 초기화일 경우에는 정적블록에서도 할 수 있다.
class Earth{
	//필드 [접근제한자][속성]데이터타입 변수명;
	static final double EARTH_RADIUS =6400;
	static final double EARTH_SURFACE_AREA;
	//The blank final field EARTH_SURFACE_AREA may not have been initialized
	static {
		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS;
	
	}
	
}