class BookPassenger{
    public BookPassenger(int i, int j, String string, int k, boolean b) {
        bookid = i;
        passengerId = j;
        Pname = string;
        age = k;
        bookingstatus = b;
    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public int getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
    public String getPname() {
        return Pname;
    }
    public void setPname(String pname) {
        Pname = pname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isBookingstatus() {
        return bookingstatus;
    }

    public void setBookingstatus(boolean bookingstatus) {
        this.bookingstatus = bookingstatus;
    }

    private int bookid;
	private int passengerId;
	private String Pname;
	private int age;
    private boolean bookingstatus;


    public void CustomerDetails() {
        System.out.println("BookPassenger [bookid=" + bookid + ", passengerId=" + passengerId + ", Pname=" + Pname + ", age=" + age+ ", bookingstatus=" + bookingstatus );
    }
}