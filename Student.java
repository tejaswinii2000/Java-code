class Student
{
  public static void main(String args[])
  {
    Student obj = new Student();
    obj Student ("KMA")
    obj Student ("KMA"2.0);
    obj Student ("KMA"2.0,4);
    System.out.println(obj.clg);
    System.out.println(obj.year);
    System.out.println(obj.rollno);

  }

    String clg;
    Double year;
    int rollno;
    void Student(){};
    void Student(String a){this.clg =a;}
    void Student(String b,Double c){this.clg = b; this.year = c;}
    void Student(String d,Double e , int f){this.clg = d; this.year = e; this.rollno = f;}

}
