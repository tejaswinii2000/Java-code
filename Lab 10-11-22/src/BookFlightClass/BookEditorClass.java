import java.util.ArrayList;
import java.util.Scanner;

public class BookEditor{
    public static void main(String[] args) {
        /*
         When enter the Book Flightwithbookid,flightid,class,date of jounrey,date of booking,number of adults,number of
            childs,gender,ticketfare and customer id details to input and print with setter and getter methods?
         */
        Scanner sc = new Scanner(System.in);
        CustomerDetails cd = new CustomerDetails();
        System.out.println("Enter booking id: ");
        cd.setBookid(sc.nextInt());
        System.out.println("Enter Flight Id: ");
        cd.setFlightid(sc.nextInt());
        System.out.println("Enter the AirClass: ");
        cd.setAirclass(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the DateOf the Journey: ");
        cd.setDateOfJourney(sc.nextLine());
        System.out.println("Enter the DateOf the Booking: ");
        cd.setDateOfBooking(sc.nextLine());
        System.out.println("Enter the Number Of Adults attending the flight: ");
        cd.setNoOfAdults(sc.nextInt());
        System.out.println("Enter the Number Of Children attending the flight: ");
        cd.setNoOfChildren(sc.nextInt());
        System.out.println("Enter your Gender: ");
        cd.setGender(sc.nextLine());
        sc.nextLine();
        System.out.println("Enter the ticket fare (Fees): ");    
        cd.setTicketFare(sc.nextInt());
        System.out.println("Enter your Customer Id: ");
        cd.setCustomerId(sc.nextInt());
        sc.close();

        // This is for to Print all the data inputted by the User
        System.out.println("The details printed are: ");
        System.out.println("Booking id is: "+ cd.getBookid());
        System.out.println("Flight id is: "+ cd.getFlightid());
        System.out.println("Air class is: "+ cd.getAirclass());
        System.out.println("DateOfJourney is: "+ cd.getDateOfJourney());
        System.out.println("DateOfBooking is: "+ cd.getDateOfBooking());
        System.out.println("NoOfAdults is: "+ cd.getNoOfAdults());
        System.out.println("NoOfChildren is: "+ cd.getNoOfChildren());
        System.out.println("Gender is: "+ cd.getGender());
        System.out.println("Ticket fare is: "+ cd.getTicketFare());
        System.out.println("Customer Id is: "+ cd.getCustomerId());

         /*
         Once user create Book Flight those details to store in Collections?
         */
        ArrayList<BookEditor> al = new ArrayList<BookEditor>();
       al.add(cd.BookEditor());
       for (BookEditor be:cd){
        System.out.println("");
        cd.CustomerDetails();
       }
    }
}