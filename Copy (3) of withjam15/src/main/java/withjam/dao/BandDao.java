package withjam.dao;

import java.util.HashMap;
import java.util.List;

import withjam.domain.Band;



public interface BandDao {

	List<?> myBandList(int uid);

	Band myBandListDetail(HashMap<String, Object> pram);

	List<?> myBandMember(int uid);

	void BandListAdd(Band band);

	void BandListDelete(Band band);

	void makeBand(Band band);

	void makeBand2(Band band);

	Band LastBandNo();

	void insertFile(String testUrl);

	Band BandInfo(int uid);
}