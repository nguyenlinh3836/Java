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
abstract public class Shape11 {
	private String color;
	private Boolean filled;
	public Shape11(){
		color = "red";
		filled = true;
	}
	public Shape11(String color, Boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor(){
		return color;
	}
	public Boolean isFilled(){
		return filled;
	}
	public void setFilled(Boolean filled){
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getPerimeter();

	@Override
	public String toString() {
		return "Shape{" + "color=" + color + ", filled=" + filled + '}';
	}
	
}
