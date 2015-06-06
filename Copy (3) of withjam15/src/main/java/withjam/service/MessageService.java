package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.MessageDao;
import withjam.domain.Message;

@Service
public class MessageService {
	
	@Autowired
	  MessageDao messageDao;

	public List<?> sendMsgBox(Message message) {
		// TODO Auto-generated method stub
		return messageDao.sendMsgBox(message);
	}

	public void mySendMsgDel(int msgNo) {
		// TODO Auto-generated method stub
		 messageDao.mySendMsgDel(msgNo);
	}
	
	public void mySendMsgDelCheck(Message message) {
		// TODO Auto-generated method stub
		messageDao.mySendMsgDelCheck(message);
	}

	public List<?> takeMsgBox(Message message) {
		// TODO Auto-generated method stub
		return messageDao.takeMsgBox(message);
	}

	public void myTakeMsgDelCheck(Message message) {
		// TODO Auto-generated method stub
		messageDao.myTakeMsgDelCheck(message);
	}

	public Message takeMsgSelectOne(Message message) {
		// TODO Auto-generated method stub
		return messageDao.takeMsgSelectOne(message);
	}

	public Message sendMsgSelectOne(Message message) {
		// TODO Auto-generated method stub
		return messageDao.sendMsgSelectOne(message);
	}

	public Message msgConfirmCnt(int uid) {
		// TODO Auto-generated method stub
		return messageDao.msgConfirmCnt(uid);
	}

	public void takeMsgConfirmUpdate(Message message) {
		// TODO Auto-generated method stub
		messageDao.takeMsgConfirmUpdate(message);
	}

	public void sendMsgInsert(Message message) {
		// TODO Auto-generated method stub
		System.out.println(message.getfUid());
		System.out.println(message.getContent());
		System.out.println(message.getTitle());
		messageDao.sendMsgInsert(message);
	}

	
}
