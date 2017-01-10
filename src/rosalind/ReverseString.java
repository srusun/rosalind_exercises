package rosalind;

public class ReverseString {
	public String reverse_string(String data){		
		StringBuilder sb = new StringBuilder(data);
        sb.reverse();
        return sb.toString();	
	}
}
