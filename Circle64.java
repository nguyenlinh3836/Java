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
public class Circle64 implements GeometricObject{
	private double radius;
	
	public Circle64(double radius){
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	@Override
	public String toString() {
		return "Circle64{" + "radius=" + radius + '}';
	}
	@Override
	public double getPerimeter(){
		return 2*Math.PI * radius;
	}
	@Override
	public double getArea(){
		return radius*radius* Math.PI;
	}
}
