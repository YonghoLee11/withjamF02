package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import withjam.domain.Member;
import withjam.domain.Reply;
import withjam.service.ReplyService;

@Controller("json.replyControl")
@RequestMapping("/json/reply")
public class ReplyControl {

	// ../json/board/uploadBoard.do

	@Autowired
	ReplyService replyService;
	
	@Autowired ServletContext    servletContext;
	
		
	@RequestMapping("/ReplyList")
	public Object replyList(int bno) throws Exception {

		System.out.println("게시글 번호 -> " + bno);

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("replyList", replyService.replyList(bno));
		resultMap.put("soundList", replyService.soundList(bno));
		resultMap.put("boardBno", bno);
		
		
		
		return resultMap;

	}
	
//	insertReply
	
	@RequestMapping(value = "/insertReply", method = RequestMethod.POST)
	public Object insertReply(MultipartFile musicFile, String content,int rBno,
			HttpSession session) throws Exception {

		Member member = new Member();
		Reply  reply  = new Reply();

        String filename = System.currentTimeMillis() + "_.mp3";
		
		String fileuploadRealPath = 
    			servletContext.getRealPath("/fileupload");
		
		File file = new File(fileuploadRealPath + "/" + filename);

		
		musicFile.transferTo(file);
		
		String rfName = filename;
		
		System.out.println(rfName + "=>rfName");
		System.out.println(content);
		System.out.println(rBno);
		
		member = (Member) session.getAttribute("loginUser");
		
		reply.setRfName(rfName);
		reply.setContent(content);
		reply.setUid(member.getUid());
		reply.setBno(rBno);
		
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		replyService.insertReply(reply);

		return resultMap;

	}

}
