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
public class IncomeTaxWithSentinel {	
	public static void main(String[] args) {
	final int SENTINEL = -1;
	final double TAX_RATE_ABOVE_20K = 0.1;
	final double TAX_RATE_ABOVE_40K = 0.2;
	final double TAX_RATE_ABOVE_60K = 0.3;
		int taxableIncome;
	double taxPayable;
		Scanner in = new Scanner(System.in);
		System.out.print("Please input Income(or -1 to end): $");
		taxableIncome = in.nextInt();	
		while(taxableIncome != SENTINEL){
			if(taxableIncome <= 20000){
		taxPayable = taxableIncome*0;
}   else if(taxableIncome <= 40000){
		taxPayable = taxableIncome*TAX_RATE_ABOVE_20K;
}   else if(taxableIncome <= 60000){
		taxPayable = taxableIncome*TAX_RATE_ABOVE_40K;
}   else{
		taxPayable = taxableIncome * TAX_RATE_ABOVE_60K;
}
		System.out.printf("The income tax playable is: $%.2f%n", taxPayable);
		System.out.print("Please input Income(or -1 to end): $");
		taxableIncome = in.nextInt();
		}
		System.out.println("Bye");
	}
}
