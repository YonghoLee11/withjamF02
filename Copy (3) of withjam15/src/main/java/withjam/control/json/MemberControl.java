package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import withjam.domain.Member;
import withjam.service.BandService;
import withjam.service.MemberService;

@Controller("json.memberControl")
@RequestMapping("/json/member")
public class MemberControl {
  static Logger log = Logger.getLogger(MemberControl.class);
  static final int PAGE_DEFAULT_SIZE = 5;
  
  @Autowired MemberService     memberService;
  @Autowired BandService       bandService;
  @Autowired ServletContext    servletContext;
 
  @RequestMapping(value="/add", method=RequestMethod.POST)
  public Object add(Member member) throws Exception {  
    
    memberService.add(member);
    
    HashMap<String,Object> resultMap = new HashMap<>();
    resultMap.put("status", "success");
    
    return resultMap;
  }
//    updateMyInfo
    
    @RequestMapping(value="/updateMyInfo", method=RequestMethod.POST)
    public Object updateMyInfo(MultipartFile myPhoto,String comment,HttpSession session) throws Exception { 
    	
    	Member member = new Member();
    	String fileuploadRealPath = 
    			servletContext.getRealPath("/fileupload");
    			String filename = System.currentTimeMillis() + "_"; 
    			File file = new File(fileuploadRealPath + "/" + filename);
    			myPhoto.transferTo(file);		
    			
    			System.out.println(myPhoto);
    			
    			System.out.println(comment);
    			String uphoto = filename;
    			
    			member = (Member) session.getAttribute("loginUser");
    			
    			
    			member.setComment(comment);
    			member.setUphoto(uphoto);
    			
    			System.out.println(member.getGenreNo());
    			System.out.println(member.getComment());
    			System.out.println(member.getUphoto());
    				    
    		    HashMap<String,Object> resultMap = new HashMap<>();
    		    resultMap.put("status", "success");	
      	
    		    memberService.updateMyInfo(member);
      
      return resultMap;
    
  }
    
    
//	myInfo
	
	@RequestMapping("/myInfo")
	  public Object myInfo(HttpSession session) throws Exception{
	    
		Member member = new Member();
		
		member = (Member) session.getAttribute("loginUser");
		
		member.setUid(member.getUid());
		
		int uid = member.getUid();
	    
		System.out.println("member.uid =" +  uid);
		
		
		member = memberService.myInfo(uid);
		
//		String fileuploadRealPath = 
//    			servletContext.getRealPath("/fileupload");
		
		String photoUrl = "../fileupload/" + member.getUphoto();
		
		member.setUphoto(photoUrl);
		
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
//	    resultMap.put("MaxFriendNo", maxFriendNo.getCnt());
	    
	    resultMap.put("myInfo", member);
	    		
	    
	    resultMap.put("myBandList", 
	    		bandService.myBandList(uid));
	    
	    return resultMap;
	  }  
}