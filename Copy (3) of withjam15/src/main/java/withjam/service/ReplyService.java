package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.ReplyDao;
import withjam.domain.Reply;

@Service
public class ReplyService {
	
	@Autowired
	  ReplyDao replyDao;

	public void insertReply(Reply reply) {
		// TODO Auto-generated method stub
		replyDao.insertReply(reply);
	}
	public List<?> replyList(int bno) {
		
		return replyDao.replyList(bno);
	}
	public List<?> soundList(int bno) {
		// TODO Auto-generated method stub
		return replyDao.soundList(bno);
	}

	
	
}
