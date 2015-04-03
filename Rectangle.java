package concurrentprogramming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jessica Ding
 */
public class Rectangle extends Shape{
    
    //Variables 
    double height;
    double width;
    
    //Constructor

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    
    //Abstract method implementation
     public double area()
    {
        return height*width;
        
    }
    
    public double perimeter()
    {
        
        return 2*height+2*width;
    }
    
    public void printMe()
    {
       System.out.println("ID: " +getId()+ " Area: " +String.format("%.3f", area())+ " Perimeter: " +String.format("%.3f",perimeter()));
    }
}
