package ch06;

//생성자constructor
/*필드의 초기화
 * 		클래스로부터 객체가 생성될 때 필드는 기본 초기값으로 자동 설정된다.
 * 		예) int -> 0, double -> 0.0, String -> null
 * 
 * 		만약 다른 값으로 초기화하고 싶다면 2가지 방법이 있다.
 *		방법1. 필드를 선언할때 초기값을 주기 
 *			=>동일한 클래스로 부터 생성되는 객체들은 모두 같은 데이터 값을 가지게 된다.
 *				(물론 객체 생성후 변경 가능 (아래코드에서는 setName()))
 *		방법2. 생성자에서 초기값을 주기
 *			=>생성자 오버로딩을 이용
 *				이때, 생성자 오버로딩을 하면 기본생성자는 없어지므로
 *					필요시 명시적으로 선언 해야함을 주의!
 */
public class Korean01 {
	
	//field[접근제한자] [속성] 데이터타입 변수명;
	String nation = "대한민국";//전역변수
	String name;	//인스턴스 변수&전역변수
	String ssn;		//인스턴스 변수&전역변수
	int age;			//인스턴스 변수&전역변수
	
	
	//constructor	[접근제한자] 클래스명([매개변수리스트]){}
	//기본생성자(default constructor)매개변수가 없는 생성자
	//생성자는 인스턴스 변수를 초기화하는 역할
	Korean01(){
		System.out.println("기본생성자입니다!");
		System.out.println("nation="+nation);
		System.out.println("age"+age);
	}
	//매개변수가 있는 생성자
	//생성자 오버로딩- 인스턴스변수의 초기화
	//객체생성시 데이터를 제시하면 그 데이터를 받아서 인스턴스 변수를 초기화하는 역할
	Korean01(String kname){
		System.out.println("매개변수 1개짜리 생성자 kname="+kname);
		name = kname;	//인스턴스변수 초기화
		System.out.println("field name="+name);
	}
	
	/*Korean01(String kssn){
		System.out.println("매개변수 1개짜리 생성자 kssn="+kssn);
	}X 타입개수 같으므로
	*/
	
	Korean01(int kage){
		System.out.println("매개변수 1개짜리 생성자 kage="+kage);
		age = kage;
		System.out.println("field age="+age);
	}
	Korean01(String kname,String kssn){
		System.out.printf("매개변수 2개짜리 생성자 %s %s\n\n",kname,kssn);
		name=kname;
		ssn=kssn;
		System.out.printf("field name=%s ssn=%s\n\n",name,ssn);
	}
	Korean01(String kname,String kssn,int kage){
		System.out.printf("매개변수 3개짜리 생성자 %s %s %d\n\n",kname,kssn,kage);
		name=kname;
		ssn=kssn;
		age = kage;
		System.out.printf("field name=%s ssn=%s age=%d\n\n",name,ssn,age);
	}
	
	//method [접근제어자] [속성] 리턴유형 함수명(매개변수리스트){}
	//개명메소드
	void setName(String kname){			//set함수
		name=kname;
		//System.out.println("setName()실행결과="+kname);
	}
	
	//이름제공 메소드
	String getName(){						//get함수
		return name;
	}
}
