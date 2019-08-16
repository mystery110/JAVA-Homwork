package Ques1;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		int input=keyboard.nextInt();
		int totalNumberOfDotPerRow=2*(input-1)+1;
		
		int index=1;
		int threshold=input;
		
		while(index<=input) {
			int dot=1;
			if(index==1) {
				while(dot!=input) {
					System.out.print(".");
					dot++;
				}
				System.out.print("*");
				dot++;
				while(dot<=totalNumberOfDotPerRow) {
					System.out.print(".");
					dot++;
				}
				System.out.println("");
			}
			else if(index!=input) {
				threshold--;
				while(dot<threshold) {
					System.out.print(".");
					dot++;
				}
				System.out.print("*");
				dot++;
				while(dot<=totalNumberOfDotPerRow-threshold) {
					System.out.print(".");
					dot++;
				}
				System.out.print("*");
				dot++;
				while(dot<=totalNumberOfDotPerRow) {
					System.out.print(".");
					dot++;
				}
				System.out.println("");
			}
			else {
				for(;dot<=totalNumberOfDotPerRow;dot++) {
					System.out.print("*");
				}
				System.out.println();
			}
			index++;
		}
		
	}

}
