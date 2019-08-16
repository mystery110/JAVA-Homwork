package hw5;

public class Email extends Document{
	private String sender,recipient,title;
	
	public Email(String new_text) {
		super(new_text);
	}
	
	public Email() {}
	
	public void setSender(String new_sender) {
		sender=new_sender;
	}
	

	
	public String getSender() {
		return sender;
	}
	
	public void setRecipient(String new_recipient) {
		recipient=new_recipient;
	}
	
	public String getRecipient() {
		return recipient;
	}
	
	public void setTitle(String new_title) {
		title=new_title;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public String getText() {
		return super.toString();
	}
	public String toString() {
		return ("From: "+getSender()+"\nTo: "+getRecipient()+"\nTitle: "+getTitle()+"\n"+super.toString());
	}
	
	
}
