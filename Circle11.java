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
public class Circle11 extends Shape11{
	 private double radius;
    private String color;
    
    public Circle11(){
		super();
        this.radius = 1.0;			
    }
    public Circle11(double radius){
		super();
        this.radius = radius;		
    }  
	public Circle11(double radius ,String color, Boolean filled ){
		super(color, filled);
		this.radius = radius;	
	}
    
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
	@Override
	public double getArea(){
		return radius*radius* Math.PI;
	}
	@Override
	public double getPerimeter(){
		return 2*Math.PI * radius;
	}

	@Override
	public String toString() {
		return "Circle{" + "radius=" + radius + ", color=" + color + '}';
	}
	
}