package bank;

public class Bankintrest {
	public static void main(String args[])
    {
        Icici icici = new Icici();
        SBI sbi = new SBI();
        AXIS axis = new AXIS();
        System.out.println("Rate of Intrest in UBI is "+icici.getRateOfInterest()+"%");
        System.out.println("Rate of Intrest in SBI is "+sbi.getRateOfInterest()+"%");
        System.out.println("Rate of Intrest in AXIS is "+axis.getRateOfInterest()+"%");
    }  

}
