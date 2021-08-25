package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//PreparedStatement 객체 이용	: 쿼리문을 미리전달하여 나중에 실행
public class UpdateTest01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn=null;
		PreparedStatement pstmt=null;
		String sql ="update emp" +
				" set sal=sal+100" +
				" where empno=8001";
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn=DriverManager.getConnection(url, user, password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			pstmt = conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			int cnt = pstmt.executeUpdate();
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			//4. 추가작업
			if(cnt>0) {
				System.out.println("업데이트되었습니다.");
			}else {
				System.out.println("업데이트x");
			}
		}catch(Exception e) { /*~~~~ */ 
			System.out.println("쿼리실행 관련 에러발생"+e);
		}finally{   /*5. 사용한 객체는 반납: 객체.close(); */
			try {
				if( pstmt!=null ) { pstmt.close(); }
				if( conn !=null ) { conn.close();  }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
