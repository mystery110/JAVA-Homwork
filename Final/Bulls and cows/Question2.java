package Ques2;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x=args[0];
		String y=args[1];
		int length=x.length();
		int A=0,B=0;
		
		for (int i=0;i<length;i++) {
			char temp=x.charAt(i);
			
			if(y.charAt(i)==temp) {
				A++;
			}
			for(int j=0;j<length;j++) {
				if(j!=i) {
					if(y.charAt(j)==temp) {
						B++;
					}
				}
			}
		}
		
		System.out.println(A+"A"+B+"B");
	}

}
