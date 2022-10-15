
public class String {

	public static void main(String args[])
	{
		String a1="Tejaswini";
		String a2="Tejaswini";
		String a3="Gangurde";
		String a4=a1+""+a3;

		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.concat(a3));
		System.out.println(a1.replace(a1,a2));
		System.out.println(a1.charAt(2));
		System.out.println(a1.compareTo(a3));
		System.out.println(a1.substring(2));
		String s1[]=a3.split(" ");
		for(String x:s1)
		{
			System.out.println(x);
		}
	}

