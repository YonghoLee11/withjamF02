package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import withjam.service.FileService;



@Controller("json.fileControl") 
@RequestMapping("/json/fileTest") 
public class FileControl {
	
	
	@Autowired ServletContext servletContext;
	@Autowired FileService fileService;
	
	@RequestMapping("/insertFile")
	  public Object insertFile(String test3 ,MultipartFile test4 ,String test2) throws Exception{
		
		
		String fileuploadRealPath = 
		servletContext.getRealPath("/fileupload");
		String filename = System.currentTimeMillis() + "_"; 
		File file = new File(fileuploadRealPath + "/" + filename);
		test4.transferTo(file);		
		
		System.out.println(test4);
		System.out.println(test3);
		System.out.println(test2);
		String testUrl = filename;
		
		fileService.insertFile(testUrl);
		
			    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
   
	    
	    
	    return resultMap;
	  }
	
}