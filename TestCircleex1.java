/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.0, "blue");
        System.out.println("The radius is :"+ c1.getRadius());
        System.out.println("The color is :" + c1.getColor());
        System.out.printf("The area is:%.2f%n",c1.getArea());
        //// c2
        Circle c2 = new Circle(3.0);
        System.out.println("The radius is :"+ c2.getRadius());
        System.out.println("The color is :" + c2.getColor());
        System.out.printf("The area is:%.2f%n",c2.getArea());
        //c3
        Circle c3 = new Circle();
        System.out.println(c3.toString());  
        /// c4 
        Circle c4 = new Circle("blue");
        System.out.println(c4.toString());
        
    }    
    
}

