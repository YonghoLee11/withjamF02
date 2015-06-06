package withjam.dao;

import java.util.List;

import withjam.domain.Board;




public interface BoardDao {

	void insertBoard(Board board);

	Board BoardPlayList(Board board);

	void insertReply(Board board);

	List<?> MyBoardList(int uid);

	List<?> BoardList(int uid);
	
	List<?> PlayerList(int bno);

	Object SelectBoard(int uid);
	
	Object hitsBoard(int bno);

	List<?> OtherBoardList(int uid);

	
}