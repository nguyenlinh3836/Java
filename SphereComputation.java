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
public class SphereComputation {
	public static void main(String[] args) {
		double surfaceArea,volume,radius;
	Scanner in = new Scanner(System.in);
		System.out.println("Enter radius:");
		radius = in.nextDouble();
		surfaceArea = 4 * Math.PI *radius*radius;
		volume = 4/3 *Math.PI*radius*radius*radius;	
		System.out.printf("SurFaceArea is : %.2f%n", surfaceArea);
		System.out.printf("Volume is : %.2f%n", volume);
	}
	
	
		
		
}
