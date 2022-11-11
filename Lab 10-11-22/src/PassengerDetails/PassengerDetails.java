import java.util.ArrayList;
public class PassengerDetails{
    public static void main(String[] args) {
        /*
        5)To add new passenger details,delete passenger details and print passenger details with bookid? 
        */
        BookPassenger b1 = new BookPassenger(12, 1, "Tejaswini",30, true);
        BookPassenger b2 = new BookPassenger(13, 2, "Vishal",29, false);
        BookPassenger b3 = new BookPassenger(14, 3, "Neha",14, false);
        b1.CustomerDetails();
        b2.CustomerDetails();
        b3.CustomerDetails();

        ArrayList<BookPassenger> al = new ArrayList<BookPassenger>();
        // Adding it to collection
        al.add(b1);
        al.add(b2);
        al.add(b3);
        // Removing one element
        al.remove(b3);
        for(BookPassenger b: al){
            System.out.println("");
            b.CustomerDetails();
        }
    }
}
