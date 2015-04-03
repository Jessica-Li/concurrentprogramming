/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentprogramming;


/**
 *
 * @author Jessica Ding
 */
public class Circle extends Shape{
    
    //Variables
    double radius;

    //Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    //Abstract method implementation
    @Override
     public double area()
    {        
        return Math.PI*Math.pow(radius,2);       
    }
    
    @Override
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    
    @Override
    public void printMe()
    {
        System.out.println("ID: " +getId()+ " Area: " +String.format("%.3f", area())+ " Perimeter: " +String.format("%.3f",perimeter()));
    }
}
