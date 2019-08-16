package hw5;

public class File extends Document{
	private String pathname;
	
	public File(String text) {
		super(text);
	}
	
	public File() {}
	
	public String getPathname() {
		return pathname;
	}
	
	public void setPathname(String new_pathname) {
		pathname=new_pathname;
	}
	
	public String toString() {
		return ("Path: "+getPathname()+"\n"+super.toString());
	}
	
	public String getText() {
		return super.toString();
	}

}
