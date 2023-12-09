import java.io.File;// import java.io.file java package
import java.io.IOException;// java.io.IOException java package
import java.util.Scanner;//java Scanner package
public class FileNotFoundException //class name
{
public static void main(String[] args) //main method
{
try//try block ExceptionHandling Block
{
	File ad=new File("C:\\Users\\munna\\OneDrive\\Documents\\ExceptionHandlingExamples\\hi.txt");//file name and location of a file
Scanner sc=new Scanner(ad);//Scanner input
while(sc.hasNextLine())//while loop
{
	String word=sc.nextLine();//method returns the rest of the current line
	System.out.print(word);//print final statement
}//closing while loop
}//closing try block
catch(Exception e)//catch ExceptionHandling block
{
	e.printStackTrace();
}//end of catch block
}
}
