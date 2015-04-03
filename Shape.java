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
public abstract class Shape {
    
    int id;
    double area;
    double perimeter;
    
    abstract public double area();
    abstract public double perimeter();
    abstract public void printMe();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
