package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.BoardDao;
import withjam.domain.Board;

@Service
public class BoardService {
	
	@Autowired
	  BoardDao boardDao;

	public void insertBoard(Board board) {
		// TODO Auto-generated method stub
		boardDao.insertBoard(board);
	}

	public Board BoardPlayList(Board board) {
		// TODO Auto-generated method stub
	    return 	boardDao.BoardPlayList(board);
	}
/*
	public void insertReply(Board board) {
		// TODO Auto-generated method stub
		boardDao.insertReply(board);
	}
	*/
	public List<?> MyBoardList(int uid) {
		
		return boardDao.MyBoardList(uid);
	}
	public List<?> BoardList(int uid) {
		
		return boardDao.BoardList(uid);
	}
	

	public Object SelectBoard(int uid) {
		// TODO Auto-generated method stub
		return boardDao.SelectBoard(uid);
	}

	public Object hitsBoard(int bno) {
		return boardDao.hitsBoard(bno);
		// TODO Auto-generated method stub
		
	}

	public List<?> PlayerList(int bno) {
		// TODO Auto-generated method stub
		return boardDao.PlayerList(bno);
	}

//	OtherBoardList
	
public List<?> OtherBoardList(int uid) {
		
		return boardDao.OtherBoardList(uid);
	}
	
	
}
