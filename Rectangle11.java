/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Rectangle11 extends Shape11{
	private double length;
    private double width;    
    public Rectangle11(){                
    }
    public Rectangle11(double width, double length){
        this.length = length;
        this.width = width;
    }
	public Rectangle11(double width, double length, String color , boolean filled){
		super(color,filled);
		this.length = length;
        this.width = width;
	}
 
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
	@Override
    public double getArea(){
        return length* width;
    }
	@Override
    public double getPerimeter(){
        return (width +  length)*2;
    }      

	@Override
	public String toString() {
		return "Rectangle{" + "length=" + length + ", width=" + width + '}';
	}
}
