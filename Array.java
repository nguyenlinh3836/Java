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
public class Array {
	public static void main(String[] args) {	
	Scanner in = new Scanner(System.in);
	int arr[] = new int[5];         
    System.out.println("Nhap phan tu mang: ");
    for (int i = 0; i < 5; i++) {
        System.out.print("nhap pha tu thu" + i + ": ");
        arr[i] = in.nextInt();		
    }    
	Avg(arr);
		System.out.println("Sap xep giam dan");
	Sort(arr);				  
	}
	public static void Avg(int[]arr){
		int sum =0;	
		int min = arr[0];
			int max = arr[0];
			for (int k=0;k<5;k++){
				if(arr[k]<min){
					min = arr[k];
				}
				if (arr[k]>max){
					max =arr[k];
				}		
			}			
			 for(int m =0;m<arr.length;m++){
				 sum+=arr[m];
			 }
			 System.out.println("Max is " + max);
			 System.out.println("Min is" + min); 	
	}
	public static void Sort(int[] arr){		
		for(int i=4;i>=0;i--){
           System.out.println(arr[i]);
			}			
			}
	
}
