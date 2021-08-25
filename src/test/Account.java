package test;


public class Account {
	//field
	private String ano;
	private String user;
	private int balance;

	//계좌번호
	//계좌소유자명	
	//잔고
	
	//constructor
	public Account(String ano,String user, int balance){
		this.ano = ano;
		this.user = user;
		this.balance = balance;
}		 
	
	//setter & getter
	public void setano(String ano) {
		this.ano = ano;
		return;
	}
	
	public void setuser(String user) {
		this.user = user;
		return;
	}
	public void setbalance(int balance) {
		this.balance = balance;
		return;
	}
	
	public int getBalance(int balance) {
		return balance;
	}


}
	

