package ch11;

import java.util.Date;

//DTO(Data Transfer Object)	:	데이터를 Object로 변환하는 객체
//일반적으로 로직을 갖고 있지 않은 순수한 데이터 객체
//필드, 그필드에 접근하기위한 getter&setter메소드만 가진 클래스
public class MemberDTO {
	
	//field	[접근제어자][속성] 타입 변수명;
	private	int			mNo;	//회원번호
	private	String		mName;	//이름
	private	String		mId;	//id
	private	String		mPwd;	//pw
	private	Date		mDate;	//회원가입일
	
	//constructor[접근제어자] 테이블명(매개변수리스트){}
	public MemberDTO(){}
	
	public MemberDTO(String mName,String mId,String mPwd){
		this.mName = mName;
		this.mId = mId;
		this.mPwd = mPwd;
	}
		
	public MemberDTO(int mNo,String mName,String mId,String mPwd,Date mDate){
		this.mNo = mNo;
		this.mName = mName;
		this.mId = mId;
		this.mPwd = mPwd;
		this.mDate = mDate;
	}
	//method	[접근제어자] [속성] 리턴유형 메서드명(매개변수리스트){}
	//getter&setter
	public int getmNo() {
		return mNo;
	}
	public void setmNo(int mNo) {
		this.mNo = mNo;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmId() {
		return mId;
	}
	public void setmId(String mId) {
		this.mId = mId;
	}
	public String getmPwd() {
		return mPwd;
	}
	public void setmPwd(String mPwd) {
		this.mPwd = mPwd;
	}
	public Date getmDate() {
		return mDate;
	}
	public void setmDate(Date mDate) {
		this.mDate = mDate;
	}

	@Override
	public String toString() {
		return "MemberDTO [mNo=" + mNo + ", mName=" + mName + ", mId=" + mId + ", mPwd=" + mPwd + ", mDate=" + mDate
				+ "]";
	}
	
	

}
