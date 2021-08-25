package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest00 {

	public static void main(String[] args) {
		//1.JDBC 드라이버 로드

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("정상적으로 JDBC 드라이버를 로드하였어요");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
		
		//2. 자바응용프로그램과 JDBC 연결
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String password = "tiger";
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;	//실행할 
				String sql = null;//실행할 쿼리문을 저장할 변수 선언
		
			try {
				conn = DriverManager.getConnection(url, user, password);
					
				//3-1쿼리 실행할 객체를 생성
				stmt = conn.createStatement();
				//3-2 쿼리실행
//				sql = "select deptno,dname,loc";
//				sql += "	from DEPT";
//				sql += " WHERE deptno=90";
				//각각 힙영역을 차지하므로 메모리 낭비될 수 있음
				
				sql ="select deptno,dname,loc"
					+ "	from DEPT"
					+ " WHERE deptno=90";
				
				
				rs=stmt.executeQuery(sql);
				
				//콘솔출력
				while (rs.next()){
					//rs.getXxx(String타입의 컬럼명)
					/*rs.getInt("DEPTNO")+"\t"+
					rs.getString("DNAME")+"\t"+
					rs.getString("LOC");
					System.out.println(rs.getString("DNAME")+"\t"+rs.getString("LOC"));
					
					int deptno = rs.getInt("DEPTNO");
					String dname = rs.getString("DNAME");
					String loc = rs.getString("LOC");
					System.out.println(deptno+"\t"+dname+"\t"+loc);*/
					int deptno = rs.getInt(1); //여기에서는 select문의 첫번째 컬럼인 deptno 
					String dname =rs.getString(2);
					String loc = rs.getString(3);
					System.out.println(deptno +"\t"+dname+"\t"+loc);
				}

				
			} catch (SQLException e) {
				e.printStackTrace();
				
			}finally {
				if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				//4.finally자원반납
				}
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
			}//end of finally	
	}//end of main

}//end of class
