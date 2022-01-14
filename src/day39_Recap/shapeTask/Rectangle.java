package day39_Recap.shapeTask;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0){
            System.err.println("Invalid length: " + length);
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0){
            System.err.println("Invalid width: " + width);
            System.exit(1);
        }
        this.width = width;
    }
}
/*
Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
 */