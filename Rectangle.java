// Name:        Jordan Rainford
// Class:       CS 3305/Section01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ IDEA

public class Rectangle {
    private double width;
    private double height;

    //Default Constructor with default values
    public Rectangle(){
        width = 1.0;
        height = 1.0;
    }

    //Overloaded Constructor with customizable values
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    //Retrieves the private 'height' variable
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    //Sets the private 'height' and 'width' variable
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    //Calculates and Prints the 'area' of the rectangle
    public double getArea(double width, double height){
        double area = width*height;
        return area;
    }

    //Calculates and Prints the 'perimeter' of the rectangle
    public double getPerimeter(double width, double height){
        double perimeter = 2*width + 2*height;
        return perimeter;
    }

    //Prints string listing details of the rectangle
    public String printRectangle(String objectName){
        return"Rectangle " + objectName + " is " + width
                + " units wide and " + height + " units high.";
    }
}
