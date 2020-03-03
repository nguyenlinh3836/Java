/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class MyCircle {
	private MyPoint center;
	private int radius;
	public MyCircle(){
		this.radius = 0;
		center.setXY(0, 0);
	}	
	public MyCircle(int radius, int x, int y){
		this.radius = radius;
		center.setXY(x, y);		
	}
	public int getRadius(){
		return radius;
	}
	public void setRadius(int radius){
		this.radius = radius;
	}
	public MyPoint getCenter(){
		return center;
	}
	public MyPoint setCenter(MyPoint center){
		return this.center = center;
	}
	public int getCenterX(){
		return center.getX();
	}
	public int getCenterY(){
		return center.getY();
	}
	public void setCenterX(int x){
		center.setX(x);
	}
	public void setCenterY(int y){
		center.setY(y);
	}
	public int[] getCenterXY(){
		return center.getXY();
	}
	public void setCenterXY(int x, int y){
		center.setXY(x, y);
	}

	@Override
	public String toString() {
		return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
	}
	
	public double getArea(){
		 return radius*radius* Math.PI;
	}
	public double getCircumference(){
		return 2*Math.PI * radius;
	}
	
	
	
	
	
	
	
	
	
	
}
