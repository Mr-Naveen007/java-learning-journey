public final class Rectangle extends Shape {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Length and breadth must be positive");
        }
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}