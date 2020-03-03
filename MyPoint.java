/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;
import java.util.Arrays;
/**
 *
 * @author Nguyen Hoang Linh
 */
public class MyPoint {
	private int x;
	private int y;
	public MyPoint(){
		this.x =0;
		this.y=0;
	}
	public MyPoint(int x, int y){
		this.x= x;
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int[] getXY(){
		int[] result = new int[2];
		result[0] =x;
		result[1]=y;
		return result;
	}
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
	public double distance(int x , int y){
		int xDiff = this.x -x;
		int yDiff = this.y-y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);			
	}
	public double distance (MyPoint Another){
		int xDiff = this.x -x;
		int yDiff = this.y -y;
		return Math.sqrt(xDiff * xDiff + yDiff * yDiff);	
		
	}
	
	public double distance(){
		return Math.sqrt(this.x*this.x +this.y*this.y);
	}

	@Override
	public String toString() {
		return "MyPoint{" + "x=" + x + ", y=" + y + '}';
	}
	

}
