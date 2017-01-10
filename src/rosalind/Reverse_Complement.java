package rosalind;

public class Reverse_Complement {
	
	String data ;
	
	public String rc() throws Exception {
		ReverseString reverseString = new ReverseString();
		String reversedData = reverseString.reverse_string(data);
		StringBuilder rc = new StringBuilder(reversedData);
		int length = reversedData.length();
		for(int iterator = 0; iterator < length; iterator++){
			char current = reversedData.charAt(iterator);
			switch(current){
				case 'A': rc.setCharAt(iterator, 'T'); break;
				case 'C': rc.setCharAt(iterator, 'G'); break;
				case 'G': rc.setCharAt(iterator, 'C'); break;
				case 'T': rc.setCharAt(iterator, 'A'); break;
				default : throw new Exception(); 
			}					
		}
		return rc.toString();

	}

}
