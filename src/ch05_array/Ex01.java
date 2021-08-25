package ch05_array;
//배열(array) : 같은타입의 여러변수를 하나의 묶음으로 다루는것
//많은양의 값(데이터)을 다룰때 유용
//배열의 각 요소는 서로 연속적
//하나의 변수안에 여러개를 넣을수있다.
/*향상된 for문을 이용하여 출력-교재166p
 * for(int index=0;index<배열의길이;index++){}	의미를 가지고있으므로
 * 		배열의 첫번째 요소부터 배열의 마지막 요소까지 접근한다.
 * for( 데이터타입 변수명 : 배열명/클래스명 ){
 * 		//반복실행코드
 * }
 */
public class Ex01 {

	public static void main(String[] args) {
		//데이터타입[]	변수명;	//배열변수선언1
		//데이터타입	변수명[];	//배열변수선언2
		//변수명=new 데이터타입[배열의크기]값;	//배열변수타입에 따라 자동으로 초기화
		
		int[]	score;	//선언
		score		= new int[3];	//heap영역에 int타입의 데이터가 들어갈 공간을 확보해줘
											//데이터타입에 따라 자동으로 초기화
											//heap영역에 생긴 주소지를 score 변수에 할당
		
		
		
		System.out.println("score="+score);	//score=[I@15db9742
		
		//값출력 : 배열변수명[인덱스번호] =>index번호는 0부터 1부터증가
	
		System.out.println("score[0]="+score[0]);
		System.out.println("score[1]="+score[1]);
		System.out.println("score[2]="+score[2]);
		System.out.println();
		
		System.out.println("배열의크기="+score.length);	//배열명.length = 배열의 크기
		System.out.println();
		
		System.out.println("for문을 이용하여 값을 출력--");
		for(int i=0; i<3 ; i++) {		//0 2 3
			System.out.println("score["+i+"]="+score[i]);
		}	
			System.out.println("for+배열의 길이를 이용하여 값을 출력--");
		for(int i=0; i<score.length ; i++) {		//0 2 3
			System.out.println("score["+i+"]="+score[i]);
		}
		System.out.println();
		
		System.out.println("향상된 for문을 이용하여 출력-교재166p");
		
		 for( int num : score ){	//score 배열의 길이만큼 반복하면서 
			 							//score [0]의 값을 가져와서 num변수에 할당
			 							//score [1]의 값을 가져와서 num변수에 할당
			 							 //score [1]의 값을 가져와서 num변수에 할당
			 System.out.println(num);
		 }
		
		
		
	}

}
