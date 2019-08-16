package hw5;

public class Document {
	private String text;
	
	
	public Document(String new_text) {
		text=new_text;
	}
	
	public Document() {}
	
	public String toString() {
		return text;
	}
	
	public void setPathname(String new_Pathname) {}
	public void setSender(String new_Sender) {}
	public void setRecipient(String new_Recipient) {}
	public void setTitle(String new_title) {}
	public String getText() {
		return text;
	}
	
	public void setText(String new_text) {
		text=new_text;
		
	}
}
