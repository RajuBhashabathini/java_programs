import java.io.*;
import java.util.*;

public class FileHandling 
{
	public static void main (String[] args) throws IOException
	{
		File file = new File("C:\\Users\\raju_bhashabathini\\Task.txt");
		
		FileOutputStream fos = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what you like");
		String text = sc.nextLine();
		try 
		{
			fos = new FileOutputStream(file);
			fos.write(text.getBytes("UTF-8"));
			System.out.println("Done");			
		}		
		catch(IOException e)
		{
			System.out.println("Error occured");
		}
		finally 
		{
			fos.close();
		}	
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			System.out.println("Size of file" + fis.available());
			int content;
			while((content=fis.read())!=-1)
				{
				System.out.print((char)content);
				}				
			}
		catch(IOException e)
		{
			System.out.println("Error occured");
		}
		finally 
		{
			fis.close();
		}
		
	}	
}