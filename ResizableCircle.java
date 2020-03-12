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
public class ResizableCircle extends Circle64 implements Resizable{
	public ResizableCircle(double radius){
		super(radius);
	}
	@Override
	public double resize(int percent){
		return getRadius() * percent / 100;
	}
	
}
