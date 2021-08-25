package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class SelectTest01 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		String sql = "select empno,ename,sal,hiredate from emp " + 
				" where empno>=7900 " + 
				" order by empno desc";
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url, user, password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			pstmt=conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
			//				executeUpdate()의 리턴형태는 int
			//				executeQuery() : select
			//				executeQuery()의 리턴형태는 ResultSet
			//4. 추가작업empno,ename,sal,hiredate
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					int empno = rs.getInt("empno");
					String ename=rs.getString("ename");
					double sal = rs.getDouble("sal");
					Date hiredate = rs.getDate("hiredate");
					System.out.printf("%5d %s %7.2f %s\n",empno,ename,sal,hiredate);
				}
			 }
			
		}catch(Exception e) { /*~~~~ */ 
			System.out.println("쿼리실행 관련 에러발생"+e);
		}finally{   /*5. 사용한 객체는 반납: 객체.close(); */
			try {
				if( rs != null ) { rs.close(); }
				if( conn != null ) { conn.close();  }
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
