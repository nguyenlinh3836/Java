/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sol1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Date {
    private int day;
    private int month;
    private int year;
public Date(int day, int month, int year){
    this.day = day;
	this.month = month;
	this.year = year;
}
public int getDay(){
    return day;
}
public  int getMonth(){
    return month;
}
public int getYear(){
    return year;
}
public void setDay(int day){
	this.day=day;
}
public void setMonth(int month){
	this.month = month;
}
    public void setyear(int year){
	this.year=year;
}
public void setDate(int day, int month, int year){	
	if(day <30){
		this.day=day;
	} else{
		System.out.println("Value not Allow");
	}
	if(month <= 12){
		this.month = month;
	}else {
		System.out.println("Value not Allow ");
	}
	if(year >= 1900 & year <= 1999){
		this.year=year;
	}else {
		System.out.println("Value not Allow");
	}
}	
public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d/%02d/%4d", month, day, year);
              // Specifier "0" to print leading zeros
   }

	

    
    
    
}
