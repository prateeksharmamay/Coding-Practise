package programmingQuestions;

public class ValidWordAbbreviation {
	public static void main(String args[]) {
		String s = "world";
		String ab = "wo";
		int i = 0, j = 0;
		boolean f = true;
		
		if(!ab.isEmpty()){
			while(i < s.length() && j < ab.length() ){
				
				if (ab.charAt(j) == '0')
		            f = false;
				
				if(Character.isDigit(ab.charAt(j)) && j != ab.length()-1){
					int c = Character.getNumericValue(ab.charAt(j));
					while(c > 0){
						i++;
						c--;
					}
					j++;
				}
				
				if(Character.isDigit(ab.charAt(j)) && j == ab.length()-1){
					int c = Character.getNumericValue(ab.charAt(j));
					while(c > 0 && i != s.length()-1){
						i++;
						c--;
					}
					if(i == s.length()-1){
						break;
					}
					else{
						f = false;
					}
				}
				
				if(s.charAt(i) != ab.charAt(j)){
					
					f = false;
					break;
				}
				i++;
				j++;
			}
		}
		else f= false;
		
		if(f) System.out.println("valid abbreviation");
		else System.out.println("Not Valid Abbreviation.");
	}
}
