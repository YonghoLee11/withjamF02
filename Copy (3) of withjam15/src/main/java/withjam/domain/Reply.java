package withjam.domain;

import java.io.Serializable;

public class Reply implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected int rno;
	protected int uid;
	protected int bno;
	protected String content;
	protected String rdate;
	protected String rfName;
	protected int rscore;
	
	protected String uname;
	protected String uphoto;
	
	
	
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public String getRfName() {
		return rfName;
	}
	public void setRfName(String rfName) {
		this.rfName = rfName;
	}
	public int getRscore() {
		return rscore;
	}
	public void setRscore(int rscore) {
		this.rscore = rscore;
	}
	@Override
	public String toString() {
		return "Reply [rno=" + rno + ", uid=" + uid + ", bno=" + bno
				+ ", content=" + content + ", rdate=" + rdate + ", rfName="
				+ rfName + ", rscore=" + rscore + ", uname=" + uname
				+ ", uphoto=" + uphoto + "]";
	}

	
	
	
	

}
