package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC : DB연동여부 테스트
public class JdbcTest01 {
	//field
	//constructor
	//JdbcTest(){System.out.println("JdbcTest()기본생성자");}
	//method

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		//JdbcTest jt= new JdbcTest();
		/*클래스명	참조변수 = new 클래스명();
		참조변수.필드
		참조변수.함수();
		*/
		
		//1.JDBC 드라이버 로드
		/*JDBC 드라이버를 로드하기 위해 드라이버 클래스 파일을 로드한다. 
		 * 다음과 같이 자바의 Class 클래스의 forName() 메소드를 이용하면 특정 클래스 파일을 읽어 들일 수 있다. */
		//MySQL이면 Class.forName("com.mysql.jdbc.Driver");
		//Oracle
		try {	//try블럭
			Class.forName("oracle.jdbc.driver.OracleDriver");	//예외처리 "oracle.jdbc.driver.OracleDriver"라는 이름의 클래스를 찾지못하면 catch블럭으로 넘어감
			System.out.println("정상적으로 JDBC 드라이버를 로드하였어요");
			
			//2. 자바응용프로그램과 JDBC 연결
			/*DriverManager는 자바 응용프로그램을 JDBC 드라이버에 연결시켜주는 클래스이다. 
			 * 아래 코드와 같이 DriverManager.getConnection() 메소드를 호출하여
			  	데이터베이스 에 연결하고 Connection 객체를 반환한다.*/
				
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connection 얻기성공");
	
			//3.쿼리 실행할 객체를 생성 및 쿼리실행
			/*자바에서 SQL문을 실행하기 이해서는  Statement 클래스*/

			//쿼리 실행할 객체를 생성
			stmt=conn.createStatement();
			System.out.println("Statement객체 생성 성공");
			
			//쿼리실행
			//쿼리문 주의 사항, 문법,데이터타입,세미콜론(;)포함x, 공백
			/*int executeUpdate(String sql):INSERT,UPDATE,DELETE sql문을 실행하고,
		 											sql문 실행으로 영향받은 행의 개수나 0을 반환 */
			//int cnt=stmt.executeUpdate("INSERT INTO DEPT WHERE (90,'IT','서울')");
			//int cnt=stmt.executeUpdate("DELETE FROM DEPT WHERE DEPTNO=90");
			int cnt;
			cnt = stmt.executeUpdate("update DEPT set loc='독도' where deptno=90");
			if(cnt>0) {
				System.out.println("쿼리가 정상적으로 실행"+cnt);
			}else {
				System.out.println("쿼리가 정상적으로x cnt="+cnt);
			}
			} catch (ClassNotFoundException e) {	//catch블럭
				System.out.println("JDBC 드라이버로드 실패");
				e.printStackTrace();					//내부적으로 실행되어지는 경로추적하여 출력
			} catch (SQLException e) {
				System.out.println("SQL 관련 에러 발생");
				e.printStackTrace();
			}finally {
				//자원반납을 반드시 하게 하려면 finally블럭안에 코드작성
				//가장최근,가장마지막에 사용했던
				//finally 블럭에는
				//catch절에 들어가던 들어가지않던
				//무조건 실행해야하는 코드를 작성한다
				//예) DB연동시의 자원반납 
				System.out.println("fanally블럭안");
				

				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				if(conn!=null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		
				
			}
				
			
			
			

				
	}	//main
				
}//class

		//다중catch절	: 
		//주의. 하위 Exception클래스부터 먼저 작성하고
		//		상위 Exception클래스부터 먼저 작성
		//		

		/*try{
		  		//코드
		  		//위험코드
			}catch(하위Exception클래스명 참조변수){
				//예외발생 처리 코드
			}catch((상위Exception클래스명 참조변수){
				//예외발생 처리 코드
			}catch((Exception클래스명 참조변수){
				//예외발생 처리 코드
			}finally{
				//finally블럭에는
				//catch절에 들어가던 들어가지 않던
				//무조건 실행하고싶은 코드를 작성
			}
		*/
