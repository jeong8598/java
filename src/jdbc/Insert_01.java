package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert_01 {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDraver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into emp(empno,ename,sal,hiredate) " + 
						" values(eno_seq.nextval,'홍1',3000,sysdate)";
		
		//1.드라이버로딩
		try {
			Class.forName(driver);
		//2.Connection 객체 얻기
			conn = DriverManager.getConnection(url, user, password);
		//3.실행객체 - PreparedStatement 객체
			pstmt=conn.prepareStatement(sql);
		//4.쿼리문실행
			int cnt = pstmt.executeUpdate();
			System.out.println("확인용 insert 실행결과 row 수"+cnt);
		//5.추가작업
			if(cnt>0) {
				System.out.println("입력되었습니다.");
			}else System.out.println("입력되지x");

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {pstmt.close();}
				if(conn!=null) {conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		//6.객체반납

	}

}
