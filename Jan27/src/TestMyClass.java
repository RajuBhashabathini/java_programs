import static org.junit.Assert.*;
import org.junit.Test;

public class TestMyClass 
	{
	MyClass obj=new MyClass();
	
	@Test
	public void testReverseString()
	{
	String str=obj.reverseString("raju");
	assertEquals("ujar",str);
	}
	@Test
	
	public void testReverseNumber()
	{
	assertEquals(123,obj.reverseNumber(321));
	}
	
	@Test
	public void testCaseChange()
	{
	assertEquals("RaJu",obj.caseChange("rAjU"));
	}
	
	@Test
	public void testRevArr()
	{
		int a[]= {1,2,3,4};
		int b[]= {4,3,2,1};
		assertArrayEquals(b,obj.revArray(a));
	}
}

