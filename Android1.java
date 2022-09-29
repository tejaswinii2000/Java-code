package android1;

public class Phones {
    public String name;public int ram;public String colour;
    public Phones(String name,int ram, String colour) {
        this.name = name;
        this.ram = ram;
        this.colour = colour;
    }
    public void info(){
        System.out.println(name +"'s colour is " + colour + " and Ram is "+ ram);
    }
} 

