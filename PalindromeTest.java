import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PalindromeTest 
{
	Palindrome p=new Palindrome();
	

	@Test
	public void testPalindromeCheck() 
	{
		assertTrue("Result: ", p.palindromeCheck("madam"));
	}

}
