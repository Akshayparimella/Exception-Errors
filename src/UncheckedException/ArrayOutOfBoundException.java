package UncheckedException;//package name
import java.util.Scanner;// util.Scanner java package
public class ArrayOutOfBoundException //class name
{
public static void main(String[] args)//main method
	{
	int [] a=new int[5];//array initialization of a variable size [5] (array syntax and declaration)
	Scanner sc=new Scanner(System.in);//Scanner input
	try//try block
	{
		System.out.println("enter array values");//final statement of enter array values
	for(int i=0;i<10;i++)//for loop and syntax
	{
		a[i]=sc.nextInt();//a[i] object creation statement
	}
	}//closing of try block
	catch(Exception e)//catch block
	{
		e.printStackTrace();
	}//closing of catch block
	}
}