/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

import javax.print.attribute.standard.MediaTray;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Square11 extends Rectangle11{
	public Square11(){
		super();
	}
	public Square11(double side){
		super(side, side);
	}
	public Square11(double side, String color , Boolean filled){
		super(side, side, color, filled);
	}
	public double getSide(){
		return getWidth();
	}
	public void setSide(double side){
		setWidth(side);
		
	}
	@Override
	public void setWidth(double side){
		setSide(side);
	}
	@Override
	public void setLength(double side){
		setLength(side);
	}
	
}
