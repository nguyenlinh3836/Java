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
public class MovablePointCircle implements Movable11{
	private int radius;
	private MovablePoint11 center;
	public MovablePointCircle(int x, int y , int xSpeed , int ySpeed , int radius) {
	this.radius = radius;
	center = new MovablePoint11(x, y, xSpeed, ySpeed);
	}
	@Override
	public void moveUp(){
	center.y -= center.ySpeed;
	}
	 @Override
   public void moveDown() {
      center.y+=center.ySpeed;
   }
   @Override
   public void moveLeft() {
      center.x-=center.xSpeed;
   }
   @Override
   public void moveRight() {
      center.x+=center.xSpeed;
   }
	
}
