package Shape;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose one \n1. Rectangle \n2. Circle \n3. Cube");
        String pilihan = s.nextLine();

        if (pilihan.equals("1")) {
            System.out.println("Masukan color");
            String color = s.nextLine();
            System.out.println("Masukan length");
            int length = s.nextInt();
            System.out.println("Masukan width");
            int width = s.nextInt();
            Rectangle rectangle  = new Rectangle("Rectangle", color, length, width);
            rectangle.print();

        } else if (pilihan.equals("2")) {
            System.out.println("Masukan color");
            String color = s.nextLine();
            System.out.println("Masukan radius");
            int radius = s.nextInt();
            Circle circle = new Circle("Circle", color, radius);
            circle.print();
        } else if (pilihan.equals("3")) {
            System.out.println("Masukan color");
            String color = s.nextLine();
            System.out.println("Masukan length");
            int length = s.nextInt();
            System.out.println("Masukan width");
            int width = s.nextInt();
            System.out.println("Masukan height");
            int height = s.nextInt();
            Cube cube = new Cube("Square", color, length, width, height);
            cube.print();

            
        }
       
    }
}
