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
public class Point {
	private float x;
	private float y;
	public Point(float x , float y){
		this.x =x;
		this.y =y;
	}
	public Point(){
		x=0.0f;
		y=0.0f;
	}
	public float getX(){
		return x;
	}
	public void setX(float x){
		this.x=x;
	}
	public float getY(){
		return this.y;
	}
	public void setY(float y){
		this.y=y;
	}
	public float[] getXY(){
		float [] result = new float[2];
		result[0] =x;
		result[1]=y;
		return result;
	}
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point{" + "(" + x  + y + ")" + '}';
	}
	
}
