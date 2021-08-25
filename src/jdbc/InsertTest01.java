package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//PreparedStatement 객체 이용	: 쿼리문을 미리전달하여 나중에 실행
public class InsertTest01 {

	public static void main(String[] args) {
		//각종 필요한 변수 선언 - 예)conn, stmt, pstmt, rs, sql
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		String sql="insert into emp(empno,ename,sal,hiredate) "+
				" values(eno_seq.nextval,'홍1',3000,sysdate)";
			
		
		try{
		//1.드라이버 로딩
			Class.forName(driver);
		//2.Connection 객체 얻기
			conn = DriverManager.getConnection(url,user,password);

		/*3.실행객체-PreparedStatement객체:conn.prepareStatement(sql),
			 Statement객체		 :conn.createStatement() */
			pstmt = conn.prepareStatement(sql);
			
		//4.쿼리문 실행-	executeUpdate()메소드사용: insert,update,delete
		//					executeUpdate()의 리턴형태 int
		//					executeQuery() : select
		//					executeQuery()의 리턴형태 ResultSet
			int cnt =pstmt.executeUpdate();
			System.out.println("확인용 insert 실행결과row수="+cnt);
		//4.추가작업
			if(cnt>0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력x");
			}
		//5.사용한 객체는 반납: 객체.close();
	}catch(Exception e) {
		System.out.println("쿼리실행 관련 에러발생"+e);
	}finally {//5.사용한 객체는 반납: 객체.close();
		try {
			if( pstmt!=null ) { pstmt.close(); }
			if( conn !=null ) { conn.close();  }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}

}
