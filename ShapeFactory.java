public class ShapeFactory {

    // Product interface
    interface Shape {
        void draw();
    }

    // Concrete products
    static class Circle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    static class Triangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a Triangle");
        }
    }

    // Factory method
    public static Shape createShape(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "triangle":
                return new Triangle();
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }

    // Demo usage
    public static void main(String[] args) {
        Shape circle = createShape("circle");
        circle.draw();

        Shape rectangle = createShape("rectangle");
        rectangle.draw();

        Shape triangle = createShape("triangle");
        triangle.draw();
    }
}
