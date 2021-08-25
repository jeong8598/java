package test;

public class BoardDTO {

	private  String title;
	private  String content;
	

	public BoardDTO(String title,String content){
		this.title=title;
		this.content=content;
	}

	public  String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public  String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

	//comment : toString()은  Object클래스의 메소드를 오버라이딩하는 것이므로
	//@를 달아주는 것이 좋아요
	@Override
	public String toString() {
		return title + "-" + content;
	}
	
	
}


