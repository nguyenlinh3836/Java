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
public class Circle {
    private double radius;
    private String color ;
 
    public Circle(){
        radius = 1.0;
        color = "red";        
    }
    public Circle (double r){
        radius = r ;             
        
    }
    public Circle(String color){
        this.color = color;
    }
    public Circle(double r, String c){/// (double radius)
        radius = r; //// this.radius = radius;
        color = c;  //// this.color = color;      
    }

    
    /// public method
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius* Math.PI;
    }  

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
 
}
