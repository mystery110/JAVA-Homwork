package Ques3;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input=args[0];
		
		String newFormation=null;
//		System.out.println(input);
		char []Ans=new char[input.length()];
		
		for(int i=0;i<input.length();i++) {
			Ans[0]=input.charAt(i);
			String temp;
			if(i==0) {
				temp=input.substring(1);
			}
			else if(i==input.length()-1) {
				temp=input.substring(0,input.length()-1);
			}
			else {
				if(i-1==0) {
					temp=input.substring(0,1)+input.substring(i+1);
				}
				else {

					temp=input.substring(0,i)+input.substring(i+1);
				}
			}
			Permutation(Ans,temp,1);
		}

	}
	 static void Permutation(char[] change,String input,int index) {
		change[index]=input.charAt(0);
		int Final=input.length();
		boolean print=true;
		String temp;
		for(int initial=0;initial<Final;initial++) {

			if(initial==0) {
				temp=input.substring(1);
			}
			else if(initial==Final-1) {
				if(initial-1==0) {
					temp=input.substring(0,1);
				}
				else {
					temp=input.substring(0,initial);
				}

			}
			else {
				if(initial-1==0) {
					temp=input.substring(0,1)+input.substring(initial+1);
				}
				else {
				temp=input.substring(0,initial-1)+input.substring(initial+1);
				}
			}
			change[index]=input.charAt(initial);
//			System.out.println(index);
//			System.out.println(change[index]);
			if(temp.length()>0) {
				Permutation(change,temp,index+1);
				print=false;
			}
		}
		for(int i=0;i<change.length && print==true ;i++) {
			System.out.print(change[i]);
		}
		if(print==true) {
			System.out.println();
		}
	}
	
	

}
