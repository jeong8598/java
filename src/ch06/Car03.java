package ch06;


//다른 생성자 호출 : this()
/*생성자 오버로딩이 많아질 경우
 * 생성자 간의 중복된 코드가 발생할수있다.
 * 매개변수의 수만 달리하고 필드 초기화 내용이 비슷한 생성자에서 이런 현상을 많이 볼 수 있다
 * 이런경우에는 필드 초기화 내용은 한 생성자에서만 집중적으로 작성 하고
 * 나머지 생성자는 초기화 내용을 가지고 있는 생성자를 호출하는 방법으로 개선을 할 수 있다.
 * 
 * 주의.
 * 반드시 생성자 안에서
 * 반드시 첫번째 문장으로 작성되어야한다.
 */
public class Car03 {

	
	//field [접근제한자][속성] 데이터타입 변수명;
	String company = "잘달려자동차";
	String model;
	String color;
	int maxSpeed;
	
	//constructor [접근제한자] 클래스명(매개변수리스트){}
	//default constructor
	Car03(){
	 System.out.println("default constructor");
	}
	//model 초기화 생성자
	//					"suv"
	Car03(String kmodel){
		//model=kmodel;		//model="suv";
		//Car03(kmodel,"노랑");	//컴파일에러
		//The method Car03(String, String) is undefined for the type Car03
		this(kmodel,"노랑"); //생성자에서 또 다른 생성자를 만듬
	
	}
	//model,color 초기화 생성자
	//					"suv"			"red"
	Car03(String kmodel,String kcolor){
	
		//color=kcolor;
		this(kmodel,kcolor,500);//생성자에서 또다른 생성자 호출()
	
	}
	//model,color,maxSpeed 초기화 생성자
					//	"suv"				"red"			500
	Car03(String kmodel,String kcolor,int kmaxSpeed ){
		model =kmodel;
		color=kcolor;
		maxSpeed=kmaxSpeed;
	}
	//method [제한제어자][속성] 리턴유형 메소드명(매개변수리스트){}l;
	
}
