import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Test;

class EmployeeTest
{
	@Test
	void testFindName() 
	{
		ArrayList a =new ArrayList<>();
		a.add("John");
		a.add("Paul");
		a.add("Susan");
		a.add("Rita");
		
		Employee e=new Employee();
		String ans=e.findName(a, "John");
		assertEquals("FOUND",ans);
	}


}
