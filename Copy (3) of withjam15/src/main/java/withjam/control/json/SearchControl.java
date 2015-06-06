package withjam.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import withjam.domain.Search;
import withjam.service.SearchService;


@Controller("json.searchControl") 
@RequestMapping("/json/search") 
public class SearchControl {
	
	@Autowired
	SearchService searchService;
	
	@RequestMapping("/searchInsert")
	  public Object searchInsert(Search search) throws Exception{
	    
		System.out.println(search);
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	     
	    searchService.searchInsert(search);
	    
	    return resultMap;
	  }
	
	@RequestMapping("/realTimeSearchRancking")
	  public Object realTimeSearchRancking() throws Exception{
	    	    
	    HashMap<String,Object> resultMap = new HashMap<>();
	    resultMap.put("status", "success");
	    resultMap.put("chartList", searchService.realTimeSearchRancking()); 
	  	    
	    return resultMap;
	  }
}
