package PracticeJava;
import java.util.Scanner;

public class Exam {
public static void main(String[] args) {
	
	int sum = 0;
	
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	for( int i =0; i<str.length();i++) {
		
		if(i>0 && i<10) {
			sum=sum+i;
		}
	}
	
	System.out.println(sum);
	
	
}
}
