package Shape;

public class shape {
    private String name;
    private String color;

    public shape() {
        this.name = "kosong";
        this.color = "black";
    }

    public shape(String name, String color) {
        this.name = name;
        this.color = color;
    }



    public String getNama() {
        return this.name;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void print() {
        System.out.println("Shape: " + this.name);
        System.out.println("Color: " + this.color);
    }

   
	}

    

