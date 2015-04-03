/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrentprogramming;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Jessica Ding
 */

public class ConcurrentProgramming {

    public static boolean addList(LinkedList list,int number)
    {
         Iterator <Shape> iterator = list.iterator(); 
         boolean unique = true;
         //testing for repeated integer values for the shape id 
            while(iterator.hasNext())
            {                      
                Shape object = iterator.next();
                if(object.getId()==number)
                {
                    /* if the id is repeated, a false boolean is returned 
                     if not repeated, a true boolean is returned*/
                    System.out.println("ID is in use. Please enter another value");
                    unique = false;
                    break;
                }
              
            }
        return unique;
    }
    
    public static void printList(LinkedList list)
    {
        //calls the printMe() method from each shape in the list
        Iterator <Shape> iterator = list.iterator();     
            while(iterator.hasNext())
            {                      
                Shape object = iterator.next();
                object.printMe();
            }
            
    }
    
    public static void removeElement(LinkedList list)
    {
        try{
        //user inpur of shape id to be deleted 
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the shape's id to be deleted: ");
        int ID = sc.nextInt();
        
        boolean found = false;
        
        Iterator <Shape> iterator = list.iterator();     
            while(iterator.hasNext())
            {         
            Shape obj = (Shape) iterator.next();
            //removes the object with the same ID
            if(obj.getId()==ID)
            {
            list.remove(obj);
            found = true;
            }
        }
        
        if(found)
            System.out.println("Shape successfully removed");
        else
            System.out.println("No such shape found");
        
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Index number is out of bounds");
        }
    }
     //================== START OF MAIN METHOD =======================
    public static void main(String[] args) {
        
//List instantiation 
LinkedList <Shape> list = new LinkedList<>();
       
//Instantiating user input 
    Scanner sc = new Scanner(System.in);
    int choice = -1;
    int number=-1;
    boolean test;
    
        while(choice!=0)
        {   
            
        try{
        System.out.println("Please select an option:\n" +
        "1. Add a rectangle\n" +
        "2. Add a circle\n" +
        "3. Add a cylinder\n" +
        "4. Print the list\n" +
        "5. Delete an item\n" +
        "0. Exit");
        choice = sc.nextInt();
        
            switch(choice)
            {
                //Exit
                case 0:
                System.out.println("Exiting");
                break;
                    
                //setting rectangle 
                case 1:
                    System.out.print("Enter shape's ID: ");
                    number = sc.nextInt();
                    test = addList(list,number);
                    while(test==false)
                    {
                    number = sc.nextInt();
                    test = addList(list,number);
                    }
                    System.out.print("Enter width and height of the rectangle: ");
                    //Object instantiation 
                    Rectangle rect = new Rectangle(sc.nextDouble(),sc.nextDouble());
                    rect.setId(number);
                    list.add(rect);
                break;
                    
                //setting circle
                case 2:
                    System.out.print("Enter shape's ID: ");
                    number = sc.nextInt();
                    test = addList(list,number);
                    
                    while(test==false)
                    {
                    number = sc.nextInt();
                    test = addList(list,number);
                    }
                    //Object instantiation
                    System.out.print("Radius of circle: ");
                    Circle circ = new Circle(sc.nextDouble());
                    circ.setId(number);
                    list.add(circ);
                
                
                break;
                    
                //adding cylinder
                case 3:
                   System.out.print("Enter shape's ID: ");
                    number = sc.nextInt();
                    test = addList(list,number);
                    while(test==false)
                    {
                    number = sc.nextInt();
                    test = addList(list,number);
                    }
                    System.out.print("Height and radius of cylinder: ");
                    Cylinder cyl = new Cylinder(sc.nextDouble(),sc.nextDouble());
                    cyl.setId(number);
                list.add(cyl);
                
                break;
                
                //printing the list
                case 4:
                printList(list);
                    break;
                
                //Deleting from the list
                case 5:
                removeElement(list);
                    break;
                    
                default:
                System.out.println("Invalid input");   
            }
            }catch(InputMismatchException e)
                 {
                 System.out.println("Invalid input");
                 sc.next();
                 }
        }
    }
  
}
