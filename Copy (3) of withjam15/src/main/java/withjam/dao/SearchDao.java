package withjam.dao;

import java.util.List;

import withjam.domain.Search;




public interface SearchDao {

	void searchInsert(Search search);

	List<?> realTimeSearchRancking();
}