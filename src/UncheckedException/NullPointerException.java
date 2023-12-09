package UncheckedException;//package name
public class NullPointerException //class name
{
public static void main(String[] args) //main method
	{
   String data=null;// declaring null to a string data
try//try block
{
System.out.println(data.toUpperCase());//print given data in upper case 
}//closing of try block
catch(Exception e)//catch block
{
	e.printStackTrace();
}//closing catch block
}
}
