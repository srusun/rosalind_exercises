package rosalind;

import static org.junit.Assert.*;

import org.junit.Test;

public class Reverse_ComplementTest {
	
	
	private Reverse_Complement reverseComplement = new Reverse_Complement();
	
	@Test
	public void reverseComplementWorksForOneBasePair() throws Exception {
		
		reverseComplement.data ="C";
		String actuals= reverseComplement.rc();
		assertEquals("G", actuals);

	}
	
	@Test
	public void reverseComplementWorksForThreeBasePairs() throws Exception {
		
		reverseComplement.data ="CGT";
		String actuals= reverseComplement.rc();
		assertEquals("ACG", actuals);

	}
	
	@Test(expected=Exception.class)
	public void failNumber() throws Exception {
		
		reverseComplement.data ="12";
		String actuals= reverseComplement.rc();
		

	}
	
	

}
