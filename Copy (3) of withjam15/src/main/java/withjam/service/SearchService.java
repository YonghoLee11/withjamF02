package withjam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.SearchDao;
import withjam.domain.Search;

@Service
public class SearchService {
	
	@Autowired
	  SearchDao searchDao;


	public void searchInsert(Search search) {
		// TODO Auto-generated method stub
		searchDao.searchInsert(search);
	}
	
	public List<?> realTimeSearchRancking() {
		// TODO Auto-generated method stub
		return searchDao.realTimeSearchRancking();
	}
	
	
}
