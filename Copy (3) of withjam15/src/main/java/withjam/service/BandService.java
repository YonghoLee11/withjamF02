package withjam.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import withjam.dao.BandDao;
import withjam.domain.Band;

@Service
public class BandService {
	
	@Autowired
	  BandDao bandDao;

	public List<?> myBandList(int uid) {
		// TODO Auto-generated method stub
		return bandDao.myBandList(uid);
	}

	public Band myBandListDetail(HashMap<String, Object> pram) {
		// TODO Auto-generated method stub
		System.out.println(pram.get("bandName"));
		return bandDao.myBandListDetail(pram);
	}

	public List<?> myBandMember(int uid) {
		// TODO Auto-generated method stub
	   return bandDao.myBandMember(uid);
	}

	public void BandListAdd(Band band) {
		
		System.out.println(band.getBandNo());
		bandDao.BandListAdd(band);
		
	}

	public void BandListDelete(Band band) {
		// TODO Auto-generated method stub
		System.out.println(band.getBandNo());
		bandDao.BandListDelete(band);
	}

	public void makeBand(Band band) {
		// TODO Auto-generated method stub
		bandDao.makeBand(band);
	}

	public void makeBand2(Band band) {
		// TODO Auto-generated method stub
		System.out.println(band.getBandNo());
		System.out.println(band.getUid());
		
		bandDao.makeBand2(band);
	}

	public Band LastBandNo() {
		// TODO Auto-generated method stub
		return bandDao.LastBandNo();
	}

	public Object BandInfo(int uid) {
		// TODO Auto-generated method stub
		return bandDao.BandInfo(uid);
	}
	
//	OtherBoardList

	
}
