package lab;

public class Threading extends Thread {
	 public void run(){  
		   System.out.println("running...");  
		  }  
		 public static void main(String args[]){  
		    Threading t1=new Threading();  
		    Threading t2=new Threading();  
		  System.out.println("Name of t1:"+t1.getName());  
		  System.out.println("Name of t2:"+t2.getName());  

		  t1.start();  
		  t2.start();  

		  t1.setName("Gangurde Tejaswini");  
		  System.out.println("After changing name of t1:"+t1.getName());  
		 }

}