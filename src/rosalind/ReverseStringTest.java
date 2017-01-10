package rosalind;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTest {

	ReverseString reverseString = new ReverseString();
	
	@Test
	public void worksForThreeBasePairs() throws Exception {
		String data ="CGT";
		String actuals= "TGC";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	@Test
	public void worksForOneBasePairC() throws Exception {
		String data ="C";
		String actuals= "C";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	@Test
	public void worksForOneBasePairG() throws Exception {
		String data ="G";
		String actuals= "G";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	@Test
	public void worksForOneBasePairA() throws Exception {
		String data ="A";
		String actuals= "A";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	@Test
	public void worksForOneBasePairT() throws Exception {
		String data ="T";
		String actuals= "T";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	@Test
	public void worksForThreeNumbers() throws Exception {
		String data ="123";
		String actuals= "321";
		assertEquals(reverseString.reverse_string(data), actuals);

	}
	

}
