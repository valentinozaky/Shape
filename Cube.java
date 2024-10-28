package Shape;

public class Cube  extends Rectangle {

    private int height;

    public Cube(String name, String color, int height, int width, int length) {
        super(name, color, length, width);
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void print() {
        super.print();
        System.out.println("Cube: " + this.height + "x" + this.height + "x" + this.height);
        System.out.println("Area: " + (this.height * this.height * this.height));
    }

}
