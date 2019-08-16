package hw5;
import java.util.Scanner;

public class Hw5 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String tempString;
		int mode,typeOfDocument;
		Document letter=new Document();
		
		tempString=keyboard.nextLine();
		mode=(int)tempString.charAt(0)-'A';
		
		tempString=keyboard.nextLine();
		typeOfDocument=(int)tempString.charAt(0)-'D';
		
		switch(typeOfDocument) {
		
		case 0:
			tempString=keyboard.nextLine();
			letter=new Document(tempString);
			break;
			
		case 1:
			Email email=new Email();
			tempString=keyboard.nextLine();
			email.setSender(tempString);
			tempString=keyboard.nextLine();
			email.setRecipient(tempString);
			tempString=keyboard.nextLine();
			email.setTitle(tempString);
			letter=email;
			tempString=keyboard.nextLine();
			letter.setText(tempString);
			break;
			
		case 2:
			String temp_pathname=keyboard.nextLine();
			tempString=keyboard.nextLine();
			File file=new File(tempString);
			file.setPathname(temp_pathname);
			letter=file;
			break;
		 
		}
		
		switch(mode) {
		case 0:
			System.out.println(letter);
			break;
			
		case 1:
			String []textSplit;
			if(typeOfDocument==0) {
				textSplit=letter.toString().split(" ");
			}
			else {
				 textSplit=letter.getText().split(" ");
			}
			tempString=keyboard.nextLine();
			int index=0;
			for(;index<textSplit.length;index++) {
				if(tempString.equals(textSplit[index])) {
					break;
				}
			}
			if(index==textSplit.length) {
				System.out.println("false");
			}
			else {
				System.out.println("true");
			}
			break;
			
		case 2:
			switch(typeOfDocument) {
			
			case 0:
				tempString=keyboard.nextLine();
				letter.setText(keyboard.nextLine());
				break;
				
				
			case 1:
				tempString=keyboard.nextLine();
				if(tempString.equals("text")) {
					letter.setText(keyboard.nextLine());
				}
				else if(tempString.equals("sender")) {
					letter.setSender(keyboard.nextLine());
				}
				else if(tempString.equals("recipient")) {
					letter.setRecipient(keyboard.nextLine());
				}
				else {
					letter.setTitle(keyboard.nextLine());
				}
				break;
				
				
				
			case 2:
				tempString=keyboard.nextLine();
				if(tempString.equals("text")) {
					letter.setText(keyboard.nextLine());
				}
				else {
					letter.setPathname(keyboard.nextLine());
				}
				break;
		}
			System.out.println(letter);
			break;
		
	}

}
}