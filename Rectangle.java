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
public class Rectangle {    
    private float length;
    private float width;    
    public Rectangle(){                
    }
    public Rectangle(float a, float b){
        length = a;
        width = b;
    }
 
    public float getLength(){
        return length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        return length* width;
    }
    public double getPerimeter(){
        return (width +  length)*2;
    }      

    @Override
    public String toString() {
        return "Retangle{" + "length=" + length + ", width=" + width + '}';
    }  
    
}
