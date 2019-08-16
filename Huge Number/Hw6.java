package hw6;

import java.util.Scanner;

public class Hw6 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String num1,num2,input=keyboard.nextLine();
		char operator;
		Scanner split= new Scanner(input);
		IOperation result;
		
		num1=split.next();
		
		while(split.hasNext()) {
			operator=split.next().charAt(0);
			num2=split.next();
			
			if(operator=='+') {
				result=new Addition();
				num1=result.perform(num1,num2);
			}
			else if(operator=='-') {
				result=new Subtraction();
				num1=result.perform(num1, num2);
			}
			else {
				num1=String.valueOf(Comparison(num1,num2,operator));
			}
		}
		System.out.println(num1);
		keyboard.close();
		split.close();

	}
	
	public static boolean Comparison(String num1,String num2,char operator) {
		IOperation result=new Comparison();
		int ans=Integer.valueOf(result.perform(num1,num2));
		
		if(operator=='=') {
			if(ans==0) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(operator=='<') {
			if(ans==2) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(ans==1) {
				return true;
			}
			else {
				return false;
			}
		}
	}

}
