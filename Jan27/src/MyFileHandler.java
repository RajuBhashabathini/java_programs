import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileHandler
{ 
	public static void main(String[] args) throws IOException
	{
			
			File file=new File("F:\\training material\\MyFolder");
			boolean mkdir = file.mkdir();
			System.out.println(mkdir);
		// FileInputStream fis=null;
		// try {
		// fis=new FileInputStream(file);
		//
		// System.out.println("Size of the file "+fis.available());
		// int content;
		// while((content=fis.read())!=-1) {
		// System.out.print((char)content);
		// }
		// }
		// catch (IOException e) {
		// System.err.println("An error occured");
		// }
		// finally {
		// fis.close();
		// }
		// FileOutputStream fos=null;
		// String text="How are you?";
		// try {
		// fos=new FileOutputStream(file);
		// fos.write(text.getBytes("UTF-8"));
		// System.out.println("Done!!!");
		// }
		// catch(IOException e){
		// System.err.println("An error occured");
		// }
		// finally {
		// fos.close();
		// } 
	}
}

