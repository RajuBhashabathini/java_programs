import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FolderInfo
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a path of directory:");
		String path=sc.next();
		sc.close();
		printDirectory(path);
	}
static void printDirectory(String path) throws IOException
	{
		File file=new File(path);
		boolean flag=file.isDirectory();
		if(flag)
		{
			File filesList[] = file.listFiles();
			for(File file1 : filesList) 
			{
				if(file1.isDirectory())
				{
					System.out.println("It is a sub folder:");
					System.out.println("Directory: "+file1.getName());
					System.out.println("path: "+file1.getParent());
					System.out.println("");
		     	}
				else
				{
				System.out.println("File: "+file1.getName());
				System.out.println("Absolute path: "+file1.getAbsolutePath());
				System.out.println("Folder path: "+file1.getParent());
				
				System.out.println("");
				}
	    	}
		}
		else
		{
		System.out.println("No Folder exists with the given name");
		}
	}

}