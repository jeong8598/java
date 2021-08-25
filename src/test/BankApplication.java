package test;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApplication extends Account{
	

	public BankApplication(String ano, String user, int balance) {
		super(ano, user, balance);}

	

	//field
	//정적변수 계좌수를 저장	 Account[] = new Account[100];
	//정적변수 				 Scanner    = new Scanner(System.in); 
	static Account[] accountList = new Account[100];
	
	//진입함수
	public static void main(String[] args) {
		
	
		//boolean run변수 = true; //반복실행여부를 저장하기위한 변수
		boolean run = true;	
		
		//반복문
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------------------------------------");
			System.out.print("선택> ");
			
		
			//번호입력받기
			Scanner sc = new Scanner(System.in);
			//입력받은 값에 따라 각 각의  함수호출
			int i=sc.nextInt();
			/*예) 1이면  계좌생성 함수호출
			     2이면  계좌목록조회 함수호출
			*/
			if(i==5) {
				run = false;
			}else if(i==4){
				withdraw();
			}else if(i==3) {
				 deposit();
			}else if(i==2) {
				accountList();
			}else if(i==1) {
				createAccount();
			}else return;
			}System.out.println("종료되었습니다.");
		}
	//계좌생성하기
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		//계좌번호, 계좌주: 초기입금액 입력받아 저장
		System.out.println("계좌번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String ano= sc.nextLine();
		System.out.println("계좌주를 입력하세요");
		String user= sc.nextLine();
		System.out.println("초기입금액을 입력하세요");
		int balance= sc.nextInt();
		//Account클래스 객체생성
		Account create = new Account(ano, user, balance);
		create.setano(ano);
		create.setuser(user);
		create.setbalance(balance);
		System.out.println("계좌가 생성되었습니다.");
		//필요시 계좌반복 개설
		return;
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("--------------");
		System.out.println("계좌목록");
		System.out.println("--------------");
		
		//계좌수만큼 반복하여 계좌번호, 계좌주, 잔고 출력
		System.out.println("계좌번호     계좌주      잔고");
		for(int i=0;i<accountList.length;i++) {
			System.out.println(accountList[i]);
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("--------------");
		System.out.println("예금");
		System.out.println("--------------");
		
		//계좌번호, 예금액입력받아 변수에 저장
		System.out.println("계좌번호를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String ano= sc.nextLine();
		System.out.println("예금할 금액을 입력하세요");
		int balance= sc.nextInt();
		//계좌번호로 계좌조회
		
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		
		//해당계좌의 잔고조회하여 출력
		
		//결과: 예금이 성공되었습니다.출력
	}
	
	//출금하기
	private static void withdraw() {
		System.out.println("--------------");
		System.out.println("출금");
		System.out.println("--------------");
		
		
		//계좌번호, 출금액입력받아 변수에 저장
		
		//계좌번호로 계좌조회
		
		//해당계좌가 없으면 결과: 계좌가 없습니다.출력
		
		//해당계좌의 잔고조회하여 출력
		//account.setBalance(account.getBalance() - money);
		//결과: 예금이 성공되었습니다.출력
	}	
	
	
	//계좌번호로 계좌조회
	//Account 배열에서 ano와 동일한 Account 객체 찾기 메소드
	private static Account findAccount(String ano) {
		
		//계좌수만큼 반복출력
			
		}
}

	


