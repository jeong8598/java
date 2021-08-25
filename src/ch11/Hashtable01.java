package ch11;

//Hashtable - 교재 p644
//철자주의

//key를 id
//value를 비번
//키보드를 이용하여 id,비번을 입력받아
//Hashtable에 저장되어있는  id와비번을 비교한 후 
//로그인 여부를 출력
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Hashtable01 {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<String,String>();
		
		//객체저장 =>db의 테이블에 해당되는부분
		map.put("hong","aaa");	
		map.put("gil","bbb");
		map.put("dong","abc");
		map.put("hong1","1234");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("id와 비번을 입력하세요");
			System.out.print("id : ");
			String id = sc.nextLine();
			
			System.out.print("pw : ");
			String pwd = sc.nextLine();
			System.out.println();
			
			//user가 입력한 id가 map에 key로 존재하는지 확인
			if(map.containsKey(id)) {
				//해당 키값의 value(map에 저장된 비번)를 가져온다.(db데이터) =>map.get(id);
				//user가 입력한 비번	=>pwd
				//2개를 비교해서
				//일치하면 로그인 성공
				if(map.get(id).equals(pwd)) {
					System.out.println("로그인 성공!");
				break;			//로그인 성공했으니 반복문 빠져나와
					//일치하지 않으면 로그인실패 =>비번 불일치로 인해
				}else {
					System.out.println("로그인실패! 비번 불일치");
				}
			}else {
				System.out.println("로그인 실패! id가 존재하지 않습니다.");
			}
			
		}
	}

}
