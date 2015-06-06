package withjam.dao;

import java.util.List;

import withjam.domain.Reply;




public interface ReplyDao {

	void insertReply(Reply reply) ;
	
	List<?> replyList(int bno);

	List<?> soundList(int bno);
	
}