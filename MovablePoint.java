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
public class MovablePoint extends Point {
	private float xSpeed;
	private float ySpeed;
	public MovablePoint(float x , float y, float xSpeed , float ySpeed){
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public MovablePoint(){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float getXSpeed(){
		return xSpeed;
	}
	public float getYSpeed(){
		return ySpeed;
	}
	public void setxSpeed( float xSpeed){
		this.xSpeed = xSpeed;
	}
	public void setYSPeed(float ySpeed){
		this.ySpeed = ySpeed;
	}
	public void setSPeed(float xSpeed, float ySpeed){
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	public float[] getSpeed(){
		float result[] = new float[2];
		result[0] = xSpeed;
		result[1] = ySpeed;
		return result;
	}

	@Override
	public String toString() {
		return "MovablePoint{" + "xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
	}
	
	
}
