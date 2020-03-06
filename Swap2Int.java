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
public class Swap2Int {
	public static void main(String[] args) {
		int num1,num2,temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Input number 1st: ");
		num1= in.nextInt();
		System.out.println("Input number 2nd:");
		num2= in.nextInt();
		temp = num1;
		num1=num2;
		num2 =temp;
		System.out.println("Number 1st is : "+ num1);
		System.out.println("Number 2nd is : " + num2);
		
		
		
		
	}
}
