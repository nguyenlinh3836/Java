/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.util.Scanner;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class CircleComputation {	
	public static void main(String[] args) {
		double radius,diameter,circumference,area;		
		double baseArea;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = in.nextDouble();
		diameter = 2.0*radius;
		area = Math.PI * radius *radius;
		circumference = 2.0 * Math.PI * radius;
		System.out.printf("Diameter is : %.2f%n", diameter);
		System.out.printf("Circumference is : %.2f%n", circumference);
		System.out.printf("Area is : %.2f%n", area);
			
		baseArea = Math.PI *radius *radius;
		
		
		
	}
		
	
		
		
		
		
		
	
}
