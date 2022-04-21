import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class madam2 {

MyClass ob=null;

@Before
public void setup() 
{
ob=new MyClass();
}

@Test
public void testCaseChange()
{
String str=ob.caseChange("khushboo");
assertEquals("KHUSHBOO",str );
}

@Test
public void testReverseString() 
{
assertEquals("dlroWolleH",ob.reverseString("Hello World") );
assertEquals("olleh",ob.reverseString("hello") );
}


}