/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Rectangle {
    private int height;
    private int width;
    
    public Rectangle(){
        height = 7;
        width = 3;
    }        
    public Rectangle(int height , int width){
        this.height = height;
        this.width = width;
    }
    public void display() {       
        for(int i = 0; i <width; i++) {
            for(int j = 0; j <height; j++) {
                System.out.print("#");
            }
            System.out.println("");
        }        
    }
    public int getArea(){
        return width * height;
    }
    public int getPerimeter(){
        return (width + height) * 2;
    }
    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int valueHeight){
        this.height = valueHeight;
    }
    public void setWidth(int valueWidth){
        this.width = valueWidth;
    }
    
}
