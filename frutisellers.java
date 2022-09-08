import java.util.Scanner;
class fruitsellers

{
    public static void main(String[] args)
    {
       
        int apples = 420;
        int sell = 40;
        int remaining = 100-40 ;
       
     
        int total_apples = ( apples * 100)/ remaining;
     

        System.out.print(" Fruit Sellers had " + total_apples + " apples");
    }
}