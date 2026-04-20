public final class Circle extends Shape { // Circle is a publicly accessible
    // subclass of Shape that cannot be further inherited.
    private final double radius; // a variable accessible only inside the
    // class whose value is set once and cannot be changed afterward.

    public Circle(double radius) { // Constructor
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = radius; // Left side (this.radius) = instance variable
                             // (belongs to object)
                            // Right side (radius) = constructor parameter
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}