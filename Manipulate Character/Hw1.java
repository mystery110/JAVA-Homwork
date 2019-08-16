package hw1;
import java.util.ArrayList;


public class Hw1 {
	public static void main(String [] args) {
		ArrayList<String> iString=new ArrayList <String>();
		for(int i=0;i<args.length;i++) {
			String [] tempString=args[i].split(" ");
			for (int j=0;j<tempString.length;j++) {
				iString.add(tempString[j]);
			}
		}
		
		int length=iString.size();
		
		for(int i=0;i<length;i++) {
			String tempString=iString.get(i);
			char tempChar=tempString.charAt(0);
			if(Check(tempChar)) {
				iString.set(i,Character.toUpperCase(tempChar)+tempString.substring(1)+"ay");
			}
			else {
				char tempCharBegin=tempString.charAt(1);
				tempString=Character.toUpperCase(tempCharBegin)+tempString.substring(2);
				iString.set(i,tempString+tempChar+"ay");				
			}
		}
		String ans=iString.get(0);
		for (int i=1;i<length;i++) {
			ans=ans+" "+iString.get(i);
		}
		System.out.print(ans);

	}
	
	public static boolean Check(char k) {
		if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u') {
			return true;
		}
		else {
			return false;
		}
	}

}
