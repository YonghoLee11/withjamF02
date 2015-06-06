package withjam.control.json;

import java.io.File;
import java.util.HashMap;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import withjam.domain.Band;
import withjam.domain.Member;
import withjam.service.BandService;


@Controller("json.bandControl") 
@RequestMapping("/json/band") 
public class BandControll {
	
	@Autowired
	BandService bandService;
	
	@Autowired ServletContext servletContext;
	
	
	@RequestMapping("/myBandList")
	  public Object myBandList(int uid) throws Exception{
	    
		System.out.println(uid);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("myBand", 
	    		bandService.myBandList(uid));
	    
	    return resultMap;
	  }
	
//	myBandListDetail
	
	
	@RequestMapping("/myBandListDetail")
	  public Object myBandListDetail(int uid , String bandName) throws Exception{
	    
//		System.out.println(bandName);
	    
		//System.out.println(uid);
//		System.out.println(bandName);
//		
//		HashMap<String,Object> pram = new HashMap<>();
//		pram.put("uid", uid);
//		pram.put("bandName", bandName);
		
		System.out.println(uid);

		
		
//	    HashMap<String,Object> resultMap = new HashMap<>();
//	    resultMap.put("status", "success");
	    
//	    resultMap.put("myBandListDetail", 
//	    		bandService.myBandListDetail(pram));
//	    
//	    resultMap.put("myBandMember", 
//	    		bandService.myBandMember(uid));
		
		
		HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	    resultMap.put("myBandMember", 
	    		bandService.myBandMember(uid));
	    
	    resultMap.put("BandInfo", 
	    		bandService.BandInfo(uid));
	    
	    return resultMap;
	    
//	    return bandService.myBandMember(uid);
	  }
	
//	BandListAdd	
	
	@RequestMapping("/BandListAdd")
	  public Object BandListAdd(Band band) throws Exception{
	    
		System.out.println(band);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	     
	   bandService.BandListAdd(band);
	    
	    return resultMap;
	  }
	
//	BandListDelete
	
	@RequestMapping("/BandListDelete")
	  public Object BandListDelete(Band band) throws Exception{
	    
		System.out.println(band);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    
	     
	   bandService.BandListDelete(band);
	    
	    return resultMap;
	  }
	
//	makeBand
	
	
	@RequestMapping("/makeBand")
	  public Object makeBand(MultipartFile photoFile,String bandName,String comment,HttpSession session) throws Exception{
		
		
//		String fileuploadRealPath = 
//    			servletContext.getRealPath("/fileupload");
//    			String filename = System.currentTimeMillis() + "_"; 
//    			File file = new File(fileuploadRealPath + "/" + filename);
//    			myPhoto.transferTo(file);		
//    			
//    			System.out.println(myPhoto);
//    			
//    			System.out.println(comment);
//    			String uphoto = filename;
//    			
//    			member = (Member) session.getAttribute("loginUser");
//    			
//    			
//    			member.setComment(comment);
//    			member.setUphoto(uphoto);
		
		
		String fileuploadRealPath = 
   			servletContext.getRealPath("/fileupload");
	    
		String filename = System.currentTimeMillis() + "_"; 
		File file = new File(fileuploadRealPath + "/" + filename);
		photoFile.transferTo(file);	
		
		String bPhoto = filename;
		
		System.out.println(photoFile);
		System.out.println(bandName);
		System.out.println(comment);
		
		Band band = new Band();
		Member member = new Member();
		
		member = (Member) session.getAttribute("loginUser");
		
		band.setUid(member.getUid());
		band.setBandName(bandName);
		band.setBandComment(comment);
		band.setbPhoto(bPhoto);
	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
//	    
//	     
	   bandService.makeBand(band);
	   
	   Band band2 = bandService.LastBandNo();
	   
	   band.setBandNo(band2.getBandNo());
	   
	   System.out.println(band2.getBandNo());
	   
	   bandService.makeBand2(band);
	    
	   return resultMap;
	  }

}
