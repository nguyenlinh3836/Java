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
public class MovablePoint11 implements Movable11{
	int x, y,xSpeed,ySpeed;     
   public MovablePoint11(int x, int y,int xSpeed , int ySpeed) {
      this.x = x;
      this.y = y;
	  this.xSpeed = xSpeed;
	  this.ySpeed = ySpeed;
   }
   @Override
   public String toString() {
      return "(" + x + "," + y + ")";
   } 
   @Override
   public void moveUp() {
      y-=ySpeed;
   }
   @Override
   public void moveDown() {
      y+=ySpeed;
   }
   @Override
   public void moveLeft() {
      x-=xSpeed;
   }
   @Override
   public void moveRight() {
      x+=xSpeed;
   }
}
