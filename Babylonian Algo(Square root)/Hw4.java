package hw4;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Keyboard_Input=new Scanner(System.in);
		double input=Keyboard_Input.nextDouble(),Temp_Double;
		double []Guess=new double[2];
		DecimalFormat Ans_Output_format=new DecimalFormat("##.##");
		
		Guess[0]=input/2;
		do {
			Temp_Double=input/Guess[0];
			Guess[1]=(Guess[0]+Temp_Double)/2;
			Temp_Double=Math.max(Guess[0],Guess[1])/Math.min(Guess[0],Guess[1]);
			Temp_Double--;
			if(Temp_Double>0.01) {
				Guess[0]=Guess[1];
			}
		}while(Temp_Double>0.01);
		System.out.println(Ans_Output_format.format(Guess[1]));
	
	}

}
