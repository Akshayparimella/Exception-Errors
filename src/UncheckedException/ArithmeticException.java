package UncheckedException;//package name
import java.util.Scanner;//import java.util.Scanner package
public class ArithmeticException //class name
{
public static void main(String []args)//main method
{
	int a,b;// using integer data type variable initialization for a and b values
	Scanner sc=new Scanner(System.in);//Scanner input
	System.out.println("enter a and b values");//final statement enter a and b values
	a=sc.nextInt();//a object creation
	b=sc.nextInt();//b object creation
	try//try Exception Handling block
	{
		System.out.println(a/b);//final statement a,b values to perform division operation
	}//end try block
	catch(Exception e)//catch Exception Handling block
	{
		e.printStackTrace();
	}//end catch block
	}
    }