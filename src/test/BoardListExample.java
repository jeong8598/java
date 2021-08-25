package test;


public class BoardListExample {

	public static void main(String[] args) {
		
		BoardDAO list = new BoardDAO();
		
		//comment : getBoardList()를 이용해서
		// Board 목록을 가져와서 위에서 선언한  list에 넣어주는 것은 어떨까?
		// comment :  그렇게 하기위해서는 
		// ArrayList<BoardDTO> boardList가 필요로 하겠지요?
		list.setBoardList("제목1", "내용1");
		list.setBoardList("제목2", "내용2");
		list.setBoardList("제목3", "내용3");
		
		
			
		System.out.println(list.getBoardList());
		
				
	}

}
