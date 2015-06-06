package withjam.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import withjam.domain.Member;
import withjam.domain.Message;
import withjam.service.MessageService;


@Controller("json.messageControl") 
@RequestMapping("/json/message") 
public class MessageControl {
	
	@Autowired
	MessageService messageService;
	
	@RequestMapping("/sendMsgBox")
	  public Object sendMsgBox(HttpSession session) throws Exception{
	    
		Member member = (Member) session.getAttribute("loginUser");
	     
		Message message = new Message();
		
		message.setUid(member.getUid());
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("Msgs", 
	    		messageService.sendMsgBox(message));
	    
	    return resultMap;
	  }
	
//	mySendMsgDel
	
	@RequestMapping("/mySendMsgDel")
	  public Object mySendMsgDel(int msgNo) throws Exception{
	    
		System.out.println(msgNo);
		messageService.mySendMsgDel(msgNo);
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
//	mySendMsgDelCheck	
	
	@RequestMapping("/mySendMsgDelCheck")
	  public Object mySendMsgDelCheck(Message message) throws Exception{
	    
		System.out.println(message);
		messageService.mySendMsgDelCheck(message);
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
	//takeMsgBox
	@RequestMapping("/takeMsgBox")
	  public Object takeMsgBox(HttpSession session) throws Exception{
	    
		Member member = (Member) session.getAttribute("loginUser");
	     
		Message message = new Message();
		
		message.setUid(member.getUid());
		
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("Msgs", 
	    		messageService.takeMsgBox(message));
	    
	    return resultMap;
	  }
	
	//myTakeMsgDelCheck
	@RequestMapping("/myTakeMsgDelCheck")
	  public Object myTakeMsgDelCheck(Message message) throws Exception{
	    
		System.out.println(message);
		messageService.myTakeMsgDelCheck(message);
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    return resultMap;
	  }
	
//	take-msg-selectOne
	
	@RequestMapping("/takeMsgSelectOne")
	  public Object takeMsgSelectOne(Message message, HttpSession session) throws Exception{
		Member member = (Member) session.getAttribute("loginUser");
		
		message.setUid(member.getUid());
		
		System.out.println(message);
		;
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("msgOne", messageService.takeMsgSelectOne(message));
	    
	    return resultMap;
	  }
	
//	sendMsgSelectOne
	
	
	@RequestMapping("/sendMsgSelectOne")
	  public Object sendMsgSelectOne(Message message, HttpSession session) throws Exception{
		Member member = (Member) session.getAttribute("loginUser");
		
		message.setUid(member.getUid());
		
		System.out.println(message);
		;
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("msgOne", messageService.sendMsgSelectOne(message));
	    
	    return resultMap;
	  }
	
	
//	msgConfirmCnt
	
	
	@RequestMapping("/msgConfirmCnt")
	  public Object msgConfirmCnt(HttpSession session) throws Exception{
		Member member = (Member) session.getAttribute("loginUser");
		
		int uid = member.getUid();
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("forMsgConfirm", messageService.msgConfirmCnt(uid));
	    
	    return resultMap;
	  }
	
//	takeMsgConfirmUpdate
	
	
	@RequestMapping("/takeMsgConfirmUpdate")
	  public Object takeMsgConfirmUpdate(Message message) throws Exception{
		messageService.takeMsgConfirmUpdate(message);
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	   
	    
	    return resultMap;
	  }
	
//	sendMsgInsert
	
	@RequestMapping("/sendMsgInsert")
	  public Object sendMsgInsert(Message message,HttpSession session) throws Exception{
		
		
		Member member = (Member) session.getAttribute("loginUser");
		message.setUid(member.getUid());
		messageService.sendMsgInsert(message);
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	   
	    
	    return resultMap;
	  }
}
