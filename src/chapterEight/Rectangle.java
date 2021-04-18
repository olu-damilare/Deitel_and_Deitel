package chapterEight;

public class Rectangle {
    private double length = 1;
    private double width = 1;

    public void setLength(double length) {
        boolean lengthIsValid = length > 0.0 && length < 20.0;
        if(lengthIsValid)
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        boolean widthIsValid = width > 0.0 && width < 20.0;
        if(widthIsValid)
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
