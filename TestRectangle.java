// Name:        Jordan Rainford
// Class:       CS 3305/Section01
// Term:        Spring 2024
// Instructor:  Dr. Haddad
// Assignment:  1
// IDE Name:    IntelliJ IDEA

import java.util.*;

public class TestRectangle {
    public static void main(String[] args) {

        //Imports scanner object to read user inputs
        Scanner scanner = new Scanner(System.in);

        //Allows user to input 'height' and 'width' values to form custom rectangle
        System.out.println("Please enter the width of your rectangle: ");
        double width = Double.parseDouble(scanner.next());
        System.out.println("Please enter the height of your rectangle: ");
        double height = Double.parseDouble(scanner.next());

        //Rectangle objects
        Rectangle myRectangle = new Rectangle();
        Rectangle yourRectangle = new Rectangle(width, height);

        //The following prints exactly how the assignment says to farmat the data
        System.out.println("myRectangle:\n" +
                "------------\n" +
                "Width:\t\t "+myRectangle.getWidth()+"\n" +
                "Height:\t\t "+myRectangle.getHeight()+"\n" +
                "Area:\t\t "+myRectangle.getArea(1, 1)+"\n" +
                "Perimeter:\t "+myRectangle.getPerimeter(1, 1)+"\n\n" +
                myRectangle.printRectangle("myRectangle") + "\n\n"+
                "yourRectangle:\n" +
                "--------------\n" +
                "Width:\t\t "+yourRectangle.getWidth()+"\n" +
                "Height:\t\t "+yourRectangle.getHeight()+"\n" +
                "Area:\t\t "+yourRectangle.getArea(width, height)+"\n" +
                "Perimeter:\t "+yourRectangle.getPerimeter(width, height)+"\n\n" +
                yourRectangle.printRectangle("yourRectangle") + "\n");

        //The following tests all  functions of the Rectangle class
        System.out.println("Testing class function getWidth on object myRectangle: " +
                myRectangle.getWidth());
        System.out.println("Testing class function getHeight on object myRectangle: " +
                myRectangle.getHeight() + "\n");

        System.out.println("Testing class function getArea on object myRectangle: " +
                myRectangle.getArea(1,1));
        System.out.println("Testing class function getPerimeter on object myRectangle: " +
                myRectangle.getPerimeter(1,1) + "\n");

        System.out.println("Testing class function getWidth on object yourRectangle: " +
                yourRectangle.getWidth());
        System.out.println("Testing class function getHeight on object yourRectangle: " +
                yourRectangle.getHeight() + "\n");

        System.out.println("Testing class function setWidth, please enter a replacement width:");
            double newWidth = scanner.nextDouble();
            width = newWidth;
            yourRectangle.setWidth(newWidth);
            System.out.println("The width on yourRectangle has been set to " + newWidth);
        System.out.println("Testing class function setHeight(), please enter a replacement height:");
            double newHeight = scanner.nextDouble();
            height = newHeight;
            yourRectangle.setHeight(newHeight);
            System.out.println("The height on yourRectangle has been set to " + newHeight + "\n");

        System.out.println("Testing class function getArea on object yourRectangle: " +
                yourRectangle.getArea(width,height));
        System.out.println("Testing class function getPerimeter on object yourRectangle: " +
                yourRectangle.getPerimeter(width,height));

    }
}
