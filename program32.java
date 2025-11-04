interface Shape {
    void area();
}

class Circle implements Shape {
    public void area() {
        double r = 5;
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}

class Square implements Shape {
    public void area() {
        double s = 4;
        System.out.println("Area of Square: " + (s * s));
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        Shape c = new Circle();
        Shape s = new Square();
        c.area();
        s.area();
    }
}

