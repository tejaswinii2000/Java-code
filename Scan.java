import java.util.Scanner; 

class Scan {
  public static void main(String[] args) {
    Scanner Obj = new Scanner(System.in); 
    System.out.println("Enter name");

    int id = Obj.nextInt();
    System.out.println("ID is: " + id);

    String Name = Obj.nextLine();  
    System.out.println("Name is: " + userName); 

    double class = Obj.nextDouble();
    System.out.println("class is: " + 3); 

    boolean pass = Obj.nextBoolean();
    System.out.println(pass); 

    Obj.close()
  }
