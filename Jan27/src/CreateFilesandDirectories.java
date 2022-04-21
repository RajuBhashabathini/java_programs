
import java.io.*;
public class CreateFilesandDirectories 
{
public static void main(String[] args) throws IOException 
	{
		File file=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton");
		file.mkdir();
		File f1=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton\\singles.txt");
		f1.createNewFile();
		File f2=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton\\dubbles.txt");
		f2.createNewFile();
		File file1=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton\\courts");
		file1.mkdir();
		File file2=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton\\courts\\smash.dat");
		file2.createNewFile();
		File f3=new File("C:\\Users\\raju_bhashabathini\\Desktop\\Badminton\\doubles.txt");
		f2.renameTo(f3);
		f1.delete();
	//	f2.delete();
	}
}