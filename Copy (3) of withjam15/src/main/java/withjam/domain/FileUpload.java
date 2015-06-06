package withjam.domain;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

public class FileUpload implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	
	protected MultipartFile   fileTest;
	protected String   url;
	
	


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public MultipartFile getFileTest() {
		return fileTest;
	}


	public void setFileTest(MultipartFile fileTest) {
		this.fileTest = fileTest;
	}
	
	
}
