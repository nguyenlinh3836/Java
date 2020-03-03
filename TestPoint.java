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
public class TestPoint {
	public static void main(String[] args) {
			MyPoint p1 = new MyPoint();
			p1.setX(8);
			p1.setY(6);
			System.out.println("x is " + p1.getX());
			System.out.println("y is " + p1.getY());
			p1.setXY(3, 0);
			System.out.println(p1.getXY()[0]);
			System.out.println(p1.getXY()[1]);
			System.out.println(p1);
			MyPoint p2 = new MyPoint(0, 4);
			System.out.println(p2);
			System.out.println(p1.distance(p2));
			System.out.println(p2.distance(p1));
			System.out.println(p1.distance(5,6));
			System.out.println(p1.distance());
			MyPoint[] points = new MyPoint[11];
			for(int i = 1; i< points.length;i++){
				points[i] = new MyPoint(i,i);
			}
			System.out.println(Arrays.toString(points));
			
			
	}

	
	
}
