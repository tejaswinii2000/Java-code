import java.io.FileWriter;
import java.io.IOException;

public class Emptxt {
  public static void main(String[] args) {
    try {
      int eid=931; String ename = "om"; int sal= 931 ;
      FileWriter myWriter = new FileWriter("emp.txt");
      myWriter.write("Emp Details- ID:"+ eid + ", Name:"+ename+", Salary:"+sal);
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
