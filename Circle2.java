/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Circle {
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0 ;
        color = "red";        
    }
    public Circle(double r){
        radius = r;
        color = "red";        
    }  
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor(String color){
        this.color = color;
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
