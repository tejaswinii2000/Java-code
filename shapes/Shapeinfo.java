package shapes;

public class Shapeinfo {
	public static void main(String args[]){
        Shape shape;
        shape = new Triangle();
        shape.sides();
        shape = new Square();
        shape.sides();
        shape = new Circle();
        shape.sides();
    }
}
