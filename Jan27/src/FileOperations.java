
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileOperations
{
	public static void main(String[] args) throws IOException {
Scanner sc=new Scanner(System.in);
//CREATING FOLDER
// System.out.println("Enter path");
// String path=sc.next();
// System.out.println("Enter folder name to be created");
// String folderName=sc.next();
//
// File file=new File(path+"\\"+folderName);
// boolean result = file.mkdir();
// if(result==true) {
// System.out.println("Folder successfully created!!");
// }
// else {
// System.out.println("Something went wrong... Could not create folder!!S");
// }
// CREATING FILE
// System.out.println("Enter file name to be created");
// String fileName=sc.next();
// File file=new File("F:\\File\\"+fileName);
// boolean res = file.createNewFile();
// if(res==true) {
// System.out.println("File successfully created!!");
// }
// else {
// System.out.println("Something went wrong... Could not create file!!S");
// }
//RENAMING A FILE
// File file=new File("F:\\File\\myFirsfile");
// File renamefile=new File("F:\\File\\Firstfile");
// boolean res = file.renameTo(renamefile);
// System.out.println(res);
//DELETING A FILE
File file=new File("F:\\File\\filetodelete");
boolean res = file.delete();
System.err.println(res);
}}

