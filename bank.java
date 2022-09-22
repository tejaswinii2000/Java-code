// write a program to show method overriding using a bank class as super class and create some subclass accordingly. 
class Bank{
	public static void main (String args[]){
    Indian_Bank ind = new Indian_Bank();
    ind.Indian_Bank();
    SBI_bank sbi = new SBI_bank();
    sbi.SBI_bank();
    } 
}
class SBI_bank extends Bank{
    SBI_bank(){
       System.out.println("You have to wait for others to get in line");
   }

}
class Indian_Bank extends Bank {
    Indian_Bank(){
        System.out.println("Your account creation will be done in a few minutes");  
}

 } 