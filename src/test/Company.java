package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Company {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "select cno, cname from company " +
				" where cno>=1000" +
				" order by cno desc";
		ResultSet rs =null;
		
		try {
			//1.드라이버 로딩
			Class.forName(driver);
			//2.Connection객체얻기
			conn = DriverManager.getConnection(url, user, password);
			//3-1.실행객체-PreparedStatement객체,Statement객체
			pstmt=conn.prepareStatement(sql);
			//3-2.쿼리문실행 - executeUpdate(): insert,update,delete
	
			rs = pstmt.executeQuery();
			if(rs!=null) {
				while(rs.next()) {
					int cno = rs.getInt("cno");
					String cname=rs.getString("cname");					
					System.out.printf("%d %s",cno,cname);
				}
			 }
			
		}catch(Exception e) {
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

