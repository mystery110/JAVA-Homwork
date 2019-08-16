package hw6;

public class Addition implements IOperation {
	public String perform(String num1,String num2) {
		int lengthNum1=num1.length(),lengthNum2=num2.length(),op1,op2,carryover=0,tempAddition;
		int noOfAddition=(lengthNum1>=lengthNum2)?lengthNum2:lengthNum1,largerElement=0;
		
		char signNum1=(num1.charAt(0)=='-')?'-':'+';
		char signNum2=(num2.charAt(0)=='-')?'-':'+';
		
		String FinalAns=null;
		String [] input= {num1,num2};
		if(signNum1==signNum2) {
			if(signNum2=='-') {//discard the negative sign
				noOfAddition--;
				input[0]=num1.substring(1);
				input[1]=num2.substring(1);
				lengthNum1--;
				lengthNum2--;
			}
			for(int i=0;i<noOfAddition;i++) {
				op1=Integer.valueOf(input[0].charAt(--lengthNum1))-'0';
				op2=Integer.valueOf(input[1].charAt(--lengthNum2))-'0';
				tempAddition=op1+op2+carryover;
				if(tempAddition>=10) {
					carryover=1;
					tempAddition-=10;
				}
				else {
					carryover=0;
				}
				if(i==0) {
					FinalAns=String.valueOf(tempAddition);
				}
				else {
					FinalAns=String.valueOf(tempAddition)+FinalAns;
				}
			}
			
			if(lengthNum1!=0||lengthNum2!=0) {
				if(lengthNum2!=0) {
					lengthNum1=lengthNum2;
					largerElement=1;
				}

			}
			
			while(lengthNum1!=0) {
				op1=Integer.valueOf(input[largerElement].charAt(--lengthNum1))-'0';
				tempAddition=op1+carryover;
				if(tempAddition>=10) {
					carryover=1;
					tempAddition-=10;
				}
				else {
					carryover=0;
				}
				FinalAns=String.valueOf(tempAddition)+FinalAns;
			}
			
			if(carryover!=0) {
				FinalAns="1"+FinalAns;
			}
			
			if(signNum2=='-') {
				FinalAns='-'+FinalAns;
			}
		}
		else {
			IOperation result=new Subtraction();
			if(signNum1=='+') {
				FinalAns=result.perform(input[0],input[1].substring(1));
			}
			else {
				FinalAns=result.perform(input[0],"-"+input[1]);
			}

		}		
		return FinalAns;
	}
	
}
