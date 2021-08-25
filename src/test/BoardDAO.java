package test;

import java.util.ArrayList;

//comment : 이 클래스가 하는 역할은 무엇일까? 생각해보기~

public class BoardDAO{
	
	ArrayList<BoardDTO> boardList = new ArrayList<BoardDTO>();

	BoardDAO() {
		
	}
	


	public ArrayList<BoardDTO> getBoardList() {
	 return boardList;
	}
	
	public void setBoardList(String title,String content) {
		 boardList.add(new BoardDTO(title,content));
	}

	
	
}

