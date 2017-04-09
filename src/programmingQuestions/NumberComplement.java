package programmingQuestions;

public class NumberComplement {

	public static void main(String[] args) {
		System.out.println(findComplement(4^7));
	}
	public static int findComplement(double num) {
		
		if(num==1.00){
			return 0;
		}
		
		if(num==0.00){
			return 1;
		}
		
		if(num==2.00){
			return 1;
		}
		
		
		int p = (int) Math.ceil(log2(num));
		int pow = (int)Math.pow(2,p);
		int result = (int)num ^ (pow-1);
        return result;
    }
	
	public static double log2(double n)
	{	
	    return (Math.log(n) / Math.log(2));
	}
}
