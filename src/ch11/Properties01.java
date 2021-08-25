package ch11;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

/* Properties 교재p658 ch11.Properties01참고
 	내부적으로 Hashtable을 사용하며, key와 value를 (String,String)으로 저장
 	주로 앱 환경설정에 관련된 속성을 저장하는 데사용
 	파일으로부터 편하게 값을 읽고 쓸수 있는 메서드를 제공
 */

//외부의 프로퍼티 파일을 읽어오기
//프로퍼티 파일을 읽어오기 위해서는 Properties객체를 생성하고
//load()메소드를 호출
//1.파일 위치확인 (workspace 소스저장위치를 기준으로)
//2.
public class Properties01 {

	public static void main(String[] args) throws Exception {
		 Properties  properties = new Properties();
		 
		 //외부의 프로퍼티 파일
		  
		 //프로퍼티 파일은 일반적으로 클래스파일과 함께 저장된다
		 //클래스파일을 기준으로 상대경로를 이용하여 프로퍼티 파일의 경로를 얻는다 : Class.getResource
		 //클래스명.Class.getResource("database.properties");
		 //Properties01.Class.getResource("database.properties");
		 
		 //getResource()는 주어진 파일의 상대경로는 url객체로 리턴
		 //url객체로 리턴.getPath() : 파일의 절대경로를 리턴받기
		 String path = Properties01.class.getResource("database.properties").getPath();
		 
		 //주어진 파일의 경로에 한글이 있는 경우 한글 복원
		 path = URLDecoder.decode(path, "utf-8");
		 
		 
		 
		 System.out.println("path="+path);
		 //외부의 프로퍼티 파일 경로 = c://a/b/database.properties 절대경로 
		 //properties.load(new FileReader(외부파일의 경로));
		
		properties.load(new FileReader(path));
		
		String driver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String user = properties.getProperty("user");
		String password = properties.getProperty("password");
		
		System.out.println("driver = "+driver);
		System.out.println("url = "+url);
		System.out.println("user = "+user);
		System.out.println("password = "+password);
		 
		 /*inputstream byte단위로 읽음
		 outputsteam byte단위로 데이터보냄
		 reader 읽음
		 filereader 외부파일을 읽음
		 writer 보냄*/
	}

}
