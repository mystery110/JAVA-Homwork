package hw2;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Hw2 {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		double a=keyboard.nextDouble();
		double b=keyboard.nextDouble();
		double c=keyboard.nextDouble();
		String format=keyboard.nextLine();
		format=keyboard.nextLine();
		double []ans =new double[2];
		DecimalFormat outputFormat=new DecimalFormat(format);
		double temp=4*a*c;
		temp=Math.pow(b,2)-temp;
		temp=Math.sqrt(temp);		
		ans[0]=(-b+temp)/(2*a);
		ans[1]=(-b-temp)/(2*a);
		if(a>0) {
			if(ans[0]<ans[1]) {
				System.out.println(outputFormat.format(ans[1])+"\n"+outputFormat.format(ans[0])+"ppp");
			}
			else {
				System.out.println(outputFormat.format(ans[0])+"\n"+outputFormat.format(ans[1]));
			}
		}
		else {
			if(ans[0]>ans[1]) {
				System.out.println(outputFormat.format(ans[1])+"\n"+outputFormat.format(ans[0]));
			}
			else {
				System.out.println(outputFormat.format(ans[0])+"\n"+outputFormat.format(ans[1]));
			}		
		}
		keyboard.close();

	}

}
