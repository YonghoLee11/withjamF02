package withjam.domain;

import java.io.Serializable;
import java.util.Date;

public class Search implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	SEARCH_NO   INTEGER     NOT NULL COMMENT '서치넘버', -- 서치넘버
//	SEARCH_INFO VARCHAR(50) NOT NULL COMMENT '서치명', -- 서치명
//	SEARCH_DATE DATE        NOT NULL COMMENT '서치한날짜', -- 서치한날짜
//	SEARCH_UID  INTEGER     NOT NULL COMMENT '서치한사람' -- 서치한사람
	
	protected int searchNo;
	protected String searchInfo;
	protected Date searchDate;
	protected int searchUid;
	protected int cnt;
	protected int no;
	
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public int getSearchNo() {
		return searchNo;
	}
	public void setSearchNo(int searchNo) {
		this.searchNo = searchNo;
	}
	public String getSearchInfo() {
		return searchInfo;
	}
	public void setSearchInfo(String searchInfo) {
		this.searchInfo = searchInfo;
	}
	public Date getSearchDate() {
		return searchDate;
	}
	public void setSearchDate(Date searchDate) {
		this.searchDate = searchDate;
	}
	public int getSearchUid() {
		return searchUid;
	}
	public void setSearchUid(int searchUid) {
		this.searchUid = searchUid;
	}
	
	

}
