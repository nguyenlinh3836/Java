/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP08;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Shape {
	private String color;
	private boolean filled;
	public Shape(){
		color = "red";
		filled = true;
	}
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	public String getColor(){
		return color;
	}
	public boolean isfilled(){
		return filled;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setFilled(boolean filled){
		this.filled = filled;
	}

	@Override
	public String toString() {
		return "Shape{" + "color=" + color + ", filled=" + filled + '}';
	}
	
}
