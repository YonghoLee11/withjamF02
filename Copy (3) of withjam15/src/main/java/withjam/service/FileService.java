package withjam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.BandDao;

@Service
public class FileService {
	
	@Autowired
	  BandDao bandDao;

	public void insertFile(String testUrl) {
		// TODO Auto-generated method stub
		bandDao.insertFile(testUrl);
	}

}