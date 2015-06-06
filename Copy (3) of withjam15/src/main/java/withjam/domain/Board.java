package withjam.domain;

import java.io.Serializable;
import java.util.Date;

//BNO     INTEGER      NOT NULL COMMENT '음원번호', -- 음원번호
//UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
//TITLE   VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
//CONTENT VARCHAR(255) NOT NULL COMMENT '내용', -- 내용
//BDATE   DATE         NOT NULL COMMENT '작성일', -- 작성일
//BF_NAME VARCHAR(50)  NULL     COMMENT '파일이름' -- 파일이름


/*
A.BNO
	,A.UID
	,A.TITLE
	,A.CONTENT
	,A.BDATE
	,A.BF_NAME
	,A.GENRENO
	,A.INSTNO
	,A.HITS
	,B.CNT
	,C.UNAME
 */
/*BNO
,TITLE
,BDATE
,BF_NAME
,UNAME
A.RNO
,A.CONTENT
,RDATE
,RF_NAME
,B.UNAME*/
public class Board implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	protected int no;
	
	protected int cnt;
	protected String uname;
	protected String buname;
	protected int bno;
	protected int uid;
	protected String title;
	protected String content;
	protected String bdate;
	protected Date rdate;
	protected String bfName;
	protected String rfName;
	protected int genreNo;
	protected int instNo;
	protected int hits;
	protected String uphoto;
	protected int boardCnt;
	protected int followerCnt;
	
	
	
	public int getBoardCnt() {
		return boardCnt;
	}
	public void setBoardCnt(int boardCnt) {
		this.boardCnt = boardCnt;
	}
	public int getFollowerCnt() {
		return followerCnt;
	}
	public void setFollowerCnt(int followerCnt) {
		this.followerCnt = followerCnt;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
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
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getBuname() {
		return buname;
	}
	public void setBuname(String buname) {
		this.buname = buname;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public String getBfName() {
		return bfName;
	}
	public void setBfName(String bfName) {
		this.bfName = bfName;
	}
	public String getRfName() {
		return rfName;
	}
	public void setRfName(String rfName) {
		this.rfName = rfName;
	}
	public int getGenreNo() {
		return genreNo;
	}
	public void setGenreNo(int genreNo) {
		this.genreNo = genreNo;
	}
	public int getInstNo() {
		return instNo;
	}
	public void setInstNo(int instNo) {
		this.instNo = instNo;
	}
	public int getHits() {
		return hits;
	}
	public void setHits(int hits) {
		this.hits = hits;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", cnt=" + cnt + ", uname=" + uname
				+ ", buname=" + buname + ", bno=" + bno + ", uid=" + uid
				+ ", title=" + title + ", content=" + content + ", bdate="
				+ bdate + ", rdate=" + rdate + ", bfName=" + bfName
				+ ", rfName=" + rfName + ", genreNo=" + genreNo + ", instNo="
				+ instNo + ", hits=" + hits + "]";
	}
	
	/*
	<result column="BNO" property="bno" />
	<result column="UID" property="uid" />
	<result column="TITLE" property="title" />
	<result column="CONTENT" property="content" />
	<result column="BDATE" property="bdate" />
	<result column="RDATE" property="rdate" />
	<result column="BF_NAME" property="bfName" />
	<result column="RF_NAME" property="rfName" />
	<result column="CNT" property="cnt" />
	<result column="UNAME" property="uname" />
	<result column="BUNAME" property="buname" />
	<result column="GENRENO" property="genreNo" />
	<result column="INSTNO" property="instNo" />
	<result column="HITS" property="hits" />*/
	
	
	
	
	

}
