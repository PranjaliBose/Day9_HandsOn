import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConcatenationTest {

	@Test
	public void testConcat()
	{
		Concatenation c=new Concatenation();
		String res=c.concat("Pranjali", "Bose");
		assertEquals("PranjaliBose", res);
	
	}

}
