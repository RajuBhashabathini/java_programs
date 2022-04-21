
import java.io.File;

public class Assessment2

{
	public static void main(String[] args) 
    {
	    String root = "C:\\Users\\raju_bhashabathini\\"; //root directory , change directory name to which one you like
	    String tab="\t";
	    String n="";
	    int d=0;
	    printDirectory(root,tab,n,d);
	}

public static void printDirectory(String root,String t,String n,int d)
{
    int directoryAgain=0;
    int temp=0;
    String tab=t;
    String name=n;  
    File folder = new File(root);
    File[] listOfFiles = folder.listFiles();
//run over all folder+ subfolders by calling this function over and over again
    
    for (int i = 0; i < listOfFiles.length; i++) 
        {
            //is file
          if (listOfFiles[i].isFile()) 
          {
              //if temp == 0 folder name is being printed
              if(temp==0)
                {
	                 if(name=="")
	                 {
	                 System.out.println(folder.getName()+ " [Directory]");
	                 temp++;
	                 name=folder.getName();
	
	                 }
	                 else if(name!=folder.getName()&&name!="") 
	                 {	
	                     System.out.println(tab+folder.getName()+ " [Directory]");
	                     tab=tab+"\t";
	                     temp++;
	                     name=folder.getName();
	                }
                }
            System.out.println(tab + listOfFiles[i].getName());
           }
	          //is directory
	          else if (listOfFiles[i].isDirectory())
	          {
	              directoryAgain++;
	              printDirectory(root+"\\"+listOfFiles[i].getName(),tab,name,directoryAgain);	
	          }
       }
    }
}