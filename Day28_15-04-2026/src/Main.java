public class Main {


    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Rectangle(5, 6), new Triangle(5, 6), new Square(10)};

        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}