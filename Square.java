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
public class Square extends Rectangle{	
	public Square(){
		
	}
	public Square(double side){
		super(side,side);
	}
	public Square(double side , String color , boolean filled){
		super(side,side, color,filled);		
	}
	public double getSide(){
		return super.getWidth();
	}
	public void setSide(double side){
		 super.setWidth(side);
	} 

	@Override
	public String toString() {
		return "Square{" +"width = "+super.getWidth() + ",length="+super.getLength()+"color="+super.getColor() + ",filled="+super.isfilled() +'}';
	}
	
}
