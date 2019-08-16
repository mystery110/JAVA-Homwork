package hw6;

public class Subtraction implements IOperation{
	public String perform(String num1,String num2) {
		int lengthNum1=num1.length(),lengthNum2=num2.length(),op1,op2,carryover=0,tempSubtraction;
		int noOfSubtraction,largerElement=0;
		
		char signNum1=(num1.charAt(0)=='-')?'-':'+';
		char signNum2=(num2.charAt(0)=='-')?'-':'+';
		char finalSign;
		
		String FinalAns=null;
		String [] input= new String [2];
		
		if(signNum1==signNum2) {
			largerElement=checkMagnitude(num1,num2);
			if(largerElement==0) {
				FinalAns="0";
				noOfSubtraction=0;
				finalSign='+';
			}
			else if(largerElement==1) {
				input[0]=num1;
				input[1]=num2;
				noOfSubtraction=lengthNum2;
				finalSign=signNum1;
			}
			else {
				input[0]=num2;
				input[1]=num1;
				noOfSubtraction=lengthNum1;
				int temp=lengthNum1;
				lengthNum1=lengthNum2;
				lengthNum2=temp;
				if(signNum1=='+') {
					finalSign='-';
				}
				else {
					finalSign='+';
				}
			}
			if(signNum2=='-' && noOfSubtraction!=0) {//discard the negative sign
				noOfSubtraction--;
				input[0]=input[0].substring(1);
				input[1]=input[1].substring(1);
				lengthNum1--;
				lengthNum2--;
			}
			for(int i=0;i<noOfSubtraction;i++) {
				op1=Integer.valueOf(input[0].charAt(--lengthNum1))-'0';
				op2=Integer.valueOf(input[1].charAt(--lengthNum2))-'0'+carryover;
				tempSubtraction=op1-op2;
				if(tempSubtraction<0) {
					op1+=10;
					carryover=1;
					tempSubtraction=op1-op2;
				}
				else {
					carryover=0;
				}		
				if(i==0) {
					FinalAns=String.valueOf(tempSubtraction);
				}
				else {
					FinalAns=String.valueOf(tempSubtraction)+FinalAns;
				}			
			}
			
			while(lengthNum1!=0 && noOfSubtraction!=0) {
				op1=Integer.valueOf(input[0].charAt(--lengthNum1))-'0';
				tempSubtraction=op1-carryover;
				if(tempSubtraction<0) {
					op1+=10;
					carryover=1;
					tempSubtraction=op1-1;
				}
				else {
					carryover=0;
				}
				FinalAns=String.valueOf(tempSubtraction)+FinalAns;
			}
			while(FinalAns.charAt(0)=='0' && noOfSubtraction!=0) {
				FinalAns=FinalAns.substring(1);
			}
			if(finalSign!='+') {
				FinalAns="-"+FinalAns;
			}
		}
		else {
			IOperation result =new Addition();
			if(signNum1=='+') {
				FinalAns=result.perform(num1,num2.substring(1));
			}
			else {
				FinalAns=result.perform(num1,"-"+num2);
			}
		}

		return FinalAns;
	}
	
	public int checkMagnitude(String num1,String num2) {
		char signNum1=(num1.charAt(0)=='-')?'-':'+';
		
		IOperation result=new Comparison();
		
		int Ans;
		
		if(signNum1=='+') {
			Ans=Integer.valueOf(result.perform(num1,num2));
		}
		
		else {
			Ans=Integer.valueOf(result.perform(num1.substring(1),num2.substring(1)));
		}
		
		return Ans;
	}

}
