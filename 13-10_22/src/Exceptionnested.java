
 
public class Exceptionnested {
	//using main method
public static void main (String args[])
{     
	//using exception Handling 
	//using nested try catch
	try{
		//start nested try catch
		try

	{
		String s=null;
		System.out.println(s.length());
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	try
	{
		int [] x= {1,2,3,4,5,6};
        System.out.println(x[6]);		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}//end nested try catch
	catch(Exception e)
	{
		System.out.println(e);
	}
}

}
