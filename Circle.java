package Shape;

public class Circle  extends shape {
    private int radius;

    public Circle() {
        super();
        this.radius = 0;
    }

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void print() {
        super.print();
        System.out.println("Cicrle: " + this.radius);
        System.out.println("Area: " + (3.14 * this.radius * this.radius));
	}

}
