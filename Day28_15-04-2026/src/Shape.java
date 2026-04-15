public abstract class Shape {
    public abstract double area();

    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("[%s] area = %.2f", name(), area());
    }
}