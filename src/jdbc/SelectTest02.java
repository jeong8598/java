package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ch11.MemberDTO;


public class SelectTest02 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs =null;
		String sql = "select mno,mname,mid,mpwd,mdate "+
						" from member" +
						" order by mno desc";
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
			//4. 추가작업	mno,mname,mid,mpwd,mdate
			
			if(rs!=null) {
				while(rs.next()) {
					MemberDTO mDTO = new MemberDTO();	
					//여기에서는 member테이블의 mno컬럼의 값을 가져와서 
					//MemberDTO클래스의 setmNo()메서드 파라미터로 제공하면
					//MemberDTO클래스의 필드에 데이터가 세팅된다.
					mDTO.setmNo(rs.getInt("mno"));
					mDTO.setmName(rs.getString("mname"));
					mDTO.setmId(rs.getString("mid"));
					mDTO.setmPwd(rs.getString("mpwd"));
					mDTO.setmDate(rs.getDate("mdate"));
					System.out.println(mDTO.toString());
					/*jdbc.MemberDTO@169bb4dd
						jdbc.MemberDTO@1f9e9475
						jdbc.MemberDTO@3aa078fd
						*/
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