package withjam.control.json;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import withjam.domain.Member;
import withjam.service.BandService;
import withjam.service.FriendService;
import withjam.service.MemberService;


@Controller("json.friendControl") 
@RequestMapping("/json/friend") 
public class FriendControll {

	@Autowired
	FriendService friendService;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	BandService bandService;
	
	@RequestMapping("/myFollowList")
	  public Object list(int uid) throws Exception{
	    
		System.out.println(uid);
	   
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
//	    resultMap.put("MaxFriendNo", maxFriendNo.getCnt());
	    
	    resultMap.put("friends", 
	    		friendService.myFollowList(uid));
	    
	    return resultMap;
	  }
	
//	myFollowerList
	
	@RequestMapping("/myFollowerList")
	  public Object myFollowerList(int uid) throws Exception{
	    
		System.out.println(uid);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("friends", 
	    		friendService.myFollowerList(uid));
	    
	    return resultMap;
	  }
	
	
	@RequestMapping("/recomendFriendList")
	  public Object recomentFriendList(int uid) throws Exception{
	      	    
//	    int maxFriendNo = friendService.getMaxFriendNo(uid);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	        
//	    resultMap.put("MaxFriendNo", maxFriendNo);
	    
//	    resultMap.put("recomendFriends", 
//	    		friendService.getFriendList(uid));
	    	    
	    return resultMap;
	  }
	
	@RequestMapping("/friendDetail")
	  public Object friendDetail(int uid) throws Exception{
	    
        HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("friendDtail", 
	    		friendService.getFriendDetail(uid));
	    
	    resultMap.put("friendMemberDetail", 
	    		memberService.selectOne(uid));
	    
	    return resultMap;
	  }
	
//	FriendDelete
	
	
	@RequestMapping("/FriendDelete")
	  public Object FriendDelete(Member member) throws Exception{
	    
      HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    friendService.FriendDelete(member);
	    
	    return resultMap;
	  }
	
//	FriendAdd
	
	@RequestMapping("/FriendAdd")
	  public Object FriendAdd(Member member) throws Exception{
	    
    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    friendService.FriendAdd(member);
	    
	    return resultMap;
	  }
	
	
//	myInfo
	
	@RequestMapping("/otherInfo")
	  public Object otherInfo(int fUid,HttpSession session) throws Exception{
	    
		session.getAttribute("loginUser");
		
		Member member = (Member) session.getAttribute("loginUser");
		
		member.setfUid(fUid);
		
	    
//	    Friend maxFriendNo = friendService.getMaxFriendNo(uid);
//	    
//	    System.out.println(maxFriendNo.getCnt());
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
//	    resultMap.put("MaxFriendNo", maxFriendNo.getCnt());
	    
	    resultMap.put("myInfo", 
	    		memberService.otherInfo(member));
	    
	    resultMap.put("myBandList", 
	    		bandService.myBandList(member.getfUid()));
	    
	    return resultMap;
	  }	

}
