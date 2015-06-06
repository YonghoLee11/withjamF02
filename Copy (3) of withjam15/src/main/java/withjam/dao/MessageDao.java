package withjam.dao;

import java.util.List;

import withjam.domain.Message;




public interface MessageDao {

	List<?> sendMsgBox(Message message);

	void mySendMsgDel(int msgNo);

	void mySendMsgDelCheck(Message message);

	List<?> takeMsgBox(Message message);

	void myTakeMsgDelCheck(Message message);

	Message takeMsgSelectOne(Message message);

	Message sendMsgSelectOne(Message message);

	Message msgConfirmCnt(int uid);

	void takeMsgConfirmUpdate(Message message);

	void sendMsgInsert(Message message);
}