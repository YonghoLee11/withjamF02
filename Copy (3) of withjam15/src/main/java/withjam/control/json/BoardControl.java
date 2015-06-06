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

import withjam.domain.Board;
import withjam.domain.Member;
import withjam.service.BoardService;

@Controller("json.boardControl")
@RequestMapping("/json/board")
public class BoardControl {

	// ../json/board/uploadBoard.do

	@Autowired
	BoardService boardService;
	
	@Autowired ServletContext    servletContext;

	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	public Object insertBoard(MultipartFile musicFile, String title, String content,
			HttpSession session) throws Exception {

		Member member = new Member();
		Board  board  = new Board();

		System.out.println(musicFile);
		System.out.println(title);
		System.out.println(content);

		String filename = System.currentTimeMillis() + "_.mp3";
		
		String fileuploadRealPath = 
    			servletContext.getRealPath("/fileupload-music");
		
		File file = new File(fileuploadRealPath + "/" + filename);
		
		musicFile.transferTo(file);
		
		
		String bfName = filename;
		
		member = (Member) session.getAttribute("loginUser");
		
		board.setBfName(bfName);
		board.setTitle(title);
		board.setContent(content);
		board.setUid(member.getUid());

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		boardService.insertBoard(board);

		return resultMap;

	}
	


	@RequestMapping("/SelectBoard")
	public Object SelectBoard(int bno) throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("selectBoard", boardService.SelectBoard(bno));

		return resultMap;

	}
	
	@RequestMapping("/MyBoardList")
	public Object MyBoardList(int uid) throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");
		
		Board board = (Board) boardService.MyBoardList(uid);
		
		System.out.println(board.getBdate() + "bdate");

		resultMap.put("myboardList", board);

		return resultMap;
	}
	
	@RequestMapping("/BoardList")
	public Object BoardList(HttpSession session) throws Exception {
		
		Member member = (Member) session.getAttribute("loginUser");
		
		
		member.getUid();

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("boardList", boardService.BoardList(member.getUid()));

		return resultMap;

	}
	
	@RequestMapping("/PlayerList")
	public Object PlayerList(int bno) throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("playerList", boardService.PlayerList(bno));

		return resultMap;

	}
	
	@RequestMapping("/hitsBoard")
	public Object hitsBoard(int bno) throws Exception {

		
		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		boardService.hitsBoard(bno);

		return resultMap;
	}
	
	
	
//	insertReply
	/*
	@RequestMapping(value = "/insertReply", method = RequestMethod.POST)
	public Object insertReply(MultipartFile musicFile, String content,
			HttpSession session) throws Exception {

		Member member = new Member();
		Board  board  = new Board();

		System.out.println(musicFile);
		System.out.println(content);

		String filename = System.currentTimeMillis() + "_.mp3";
		File file = new
		File("/home/js/javaide/workspace/withjam15/src/main/webapp/fileupload-music/"
		+ filename);
		musicFile.transferTo(file);
		
		String rfName = filename;
		
		System.out.println(rfName + "=>rfName");
		
		member = (Member) session.getAttribute("loginUser");
		
		board.setRfName(rfName);
		board.setContent(content);
		board.setUid(member.getUid());
		
		System.out.println(board.getRfName() + "=>rfName2");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		boardService.insertReply(board);

		return resultMap;

	}*/
	
	
	
	@RequestMapping("/OtherBoardList")
	public Object OtherBoardList(int uid) throws Exception {
		
		System.out.println(uid + "fUid");

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		resultMap.put("boardList", boardService.OtherBoardList(uid));

		return resultMap;

	}

}
