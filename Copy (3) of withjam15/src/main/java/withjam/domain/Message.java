package withjam.domain;

import java.io.Serializable;

//MSGNO    INTEGER      NOT NULL COMMENT '쪽지번호', -- 쪽지번호
//UID      INTEGER      NOT NULL COMMENT '보내는사람', -- 보내는사람
//UID2     INTEGER      NOT NULL COMMENT '받는사람', -- 받는사람
//TITLE    VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
//CONTENT  VARCHAR(255) NOT NULL COMMENT '내용', -- 내용
//SENDTIME DATE         NOT NULL COMMENT '작성일', -- 작성일
//CONFIRM  VARCHAR(50)  NOT NULL COMMENT '확인여부' -- 확인여부

public class Message implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int msgNo;
	private int uid;
	private int fUid;
	private String title;
	private String content;
	private String sendTime;
	private String confirm;
	private String uname;
	private String fUname;
	private String myConfirm;
	private String checkVal;
	private int cnt;
	
	
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public String getCheckVal() {
		return checkVal;
	}
	public void setCheckVal(String checkVal) {
		this.checkVal = checkVal;
	}
	public String getMyConfirm() {
		return myConfirm;
	}
	public void setMyConfirm(String myConfirm) {
		this.myConfirm = myConfirm;
	}
	public int getMsgNo() {
		return msgNo;
	}
	public void setMsgNo(int msgNo) {
		this.msgNo = msgNo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getfUid() {
		return fUid;
	}
	public void setfUid(int fUid) {
		this.fUid = fUid;
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
	public String getSendTime() {
		return sendTime;
	}
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getfUname() {
		return fUname;
	}
	public void setfUname(String fUname) {
		this.fUname = fUname;
	}
	
	

}
