package Shape;

public class Rectangle extends shape {
    private int length;
    private int width;

    public Rectangle() {
        super();
        this.length = 0;
        this.width = 0;
    }

    public Rectangle(String name, String color, int length, int width) {
        super(name, color);
        this.width = width;
        this.width = width;
    }

    public int getWidth() {
        return this.length;
    }

    public void setWidth(int length) {
        this.width = length;
    }

    public int getHeight() {
        return this.width;
    }

    public void setHeight(int width) {
        this.width = width;
    }

    public void print() {
        super.print();
        System.out.println("Rectangle: " + this.length + "x" + this.width);
        System.out.println("Area: " + (this.length * this.width));
    }

}                         



