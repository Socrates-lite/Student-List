import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTest  {

	

	public static void main(String[] args) throws FileNotFoundException {
		
	    Student list = new Student();
	    
	    Scanner sc = new Scanner(new File("C:\\Users\\sunda\\eclipse-workspace\\Assignment3\\src\\test1.txt"));
	    
	   while(sc.hasNextLine()) {
		    String str = sc.nextLine();
		    String[] str1 = str.split(" ");
		    
		   int i = Integer.valueOf(str1[0]);
		   double d = Double.valueOf(str1[1]);
		   
		   list.add(i, d);   
	   }

	   
	   list.printList();
	    

		

		}
}
