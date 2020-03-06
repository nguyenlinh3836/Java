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
public class SumProduct {
	public static void main(String[] args) {
		int number1,number2,number3;
		int sum,product,min,max;		
		Scanner in = new Scanner(System.in);
		System.out.println("Input 3 number:");
		number1 = in.nextInt();
		number2=in.nextInt();
		number3 = in.nextInt();
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		///min 
		min =number1;
		if(number2<min){
			min = number2;
		}
		if(number3<min){
			min = number3;
		}
		/// max 
		max =number1;
		if(number2 > max){
			max = number2;
		}
		if(number3 > max){
			max = number3;
		}
		System.out.println("Max is " + max);
		System.out.println("min is " + min);
		
	}
}
