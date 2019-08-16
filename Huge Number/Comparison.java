package hw6;

public class Comparison implements IOperation {
	public String perform (String num1 , String num2) {
		int lengthNum1=num1.length(),lengthNum2=num2.length(),op1,op2,carryover=0,tempSubtraction;
		
		char signNum1=(num1.charAt(0)=='-')?'-':'+';
		char signNum2=(num2.charAt(0)=='-')?'-':'+';
		
		String FinalAns=null;
		
		if(lengthNum1==lengthNum2) {
			if(signNum1!=signNum2) {
				if(signNum1=='+') {
					FinalAns="1";
				}
				else {
					FinalAns="2";
				}
			}
			else {
				int i=0;
				for(;i<lengthNum1;i++) {
					op1=Integer.valueOf(num1.charAt(i))-'0';
					op2=Integer.valueOf(num2.charAt(i))-'0';
					tempSubtraction=op1-op2;
					if(tempSubtraction!=0) {
						if(tempSubtraction<0) {
							FinalAns="2";
						}
						else {
							FinalAns="1";
						}
						break;
					}				
				}
				if(i==lengthNum1) {
					FinalAns="0";
				}
			}
		}
		else if(lengthNum1>lengthNum2) {
			if(signNum1==signNum2) {
				FinalAns="1";
			}
			else {
				if(signNum2=='+') {
					FinalAns="2";
				}
				
				else {
					FinalAns="1";
				}
			}
		}
		
		else {//lengthNum2 >lengthNum1
			if(signNum1==signNum2 ) {
				if(signNum1=='+') {
					FinalAns="2";
				}
				else {
					FinalAns="1";
				}
			}
			else {
				if(signNum1=='+') {
					FinalAns="1";
				}
				
				else {
					FinalAns="2";
				}
			}
		
		}
		return FinalAns;
	}
}
