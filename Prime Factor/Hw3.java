package hw3;

import java.util.Scanner;
import java.util.Vector;
import java.lang.Math;

public class Hw3 {
	public static Vector<Integer>  prime_factor=new Vector<>();
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String temp_string=keyboard.nextLine(); //Read the string input by user
		String func;
		double value,temp_double;
		boolean finalAns;
		int temp_int=0;
		prime_factor.add(2);
		prime_factor.add(3);
		prime_factor.add(5);
		prime_factor.add(6);


		
		keyboard.close();
		keyboard=new Scanner(temp_string +"=");
		keyboard.useDelimiter("=");  //Easier to seperate a string using =
		func=keyboard.next();
		value=keyboard.nextDouble();
		

		if(func.charAt(0)=='X') {
			finalAns=checkTrueOrFalse(value);
			System.out.println(finalAns);
		}
		else if(func.charAt(0)=='Y'){
			int no=6;//Since the first six element is known , we start calculating from 7
			if(value%1==0 && value>0 &&value<=6) {
				System.out.println(value);
			}
			else {
				temp_double=6;
				if(value>=1000) {
					no=1000;
					temp_double=51200000;
				}
				while(no!=value) {
					temp_double++;

					if(checkTrueOrFalse(temp_double)) {
						no++;
						temp_int++;
					}
				}
				System.out.println((int)temp_double);
			}
		}

		
		
		keyboard.close();
		
	}
	
	public static boolean checkTrueOrFalse(double val) {
		double temp_double=0,initial_val=val;
		if(val<=0 || val%1!=0) {//check whether it is a positive integer 
			return false;
		}
		else if(val<=5) {
			return true;
		}
		do {
			initial_val=val;
			for (int i=prime_factor.size()-1;i>=0;i--) {
				if(val%prime_factor.get(i)==0) {
					val=val/prime_factor.get(i);
					i++;
				}
			}
		}while(initial_val!=val);// determine whether val has changed in the loop
		if(initial_val==val && val!=1) {
			return false;
		}
		else {
			return true;
		}
	}
	

}
