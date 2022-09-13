class PostOffice{
    void Area(int pincode){
        System.out.println(pincode);
    }
    void Area(int pincode, string PostOffice){
        System.out.println(pincode);
        System.out.println(PostOffice);
    }
    void Area(int pincode,string PostOffice){
         System.out.println(pincode);
         System.out.println(PostOffice);
         System.out.println(city);
    }
    public static void main(string[]args){
        java.util.Scanner scan =new java.util.Scanner(System.in);

        System.out.print("How many data you want to enter:");
        int num_data =scan.nextInt();

        PostOffice po1 = new PostOffice();

        switch(num_data){
            case 1:
                    po1.Area(421102);
                    break;
            case 2:
                    po1.Area(421102,"Mohone");
                    break;
            case 3:
                    po1.Area(421102,"Mohone","Kalyan");
                    break
            default:
                    System.out.print("Invalid Input");

        }
   }
}
    