public class StringBufferBuilder {
	public static void main (String args[])
	{
		StringBuffer sb1= new StringBuffer("Tejaswini");
		StringBuilder sb2= new StringBuilder("hii");

		System.out.println(sb1);
		sb1.insert(5, "Gangurde");
		sb2.append("Tejaswini Gangurde");
		System.out.println(sb2);
		System.out.println(sb1.toString().equals(sb2.toString()));
		sb1.delete(2, 4).reverse();
		System.out.println(sb1);

	}

}
