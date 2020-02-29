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
public class Time {
	private int hour;
	private int minute;
	private int second;
public Time(int hour, int minute,int second){
	this.hour = 0;
	this.minute = 0;
	this.second = 0;
}
public int getHour(){
	return hour;
}
public int getMinute(){
	return minute;
}
public int getSecond(){
	return second;
}
public void setTime(int hour, int minute, int second){
	if( hour>=0 & hour <= 23 ){
		this.hour = hour;
	} else {
		System.out.println("Not a Time");
	}
	if (minute >=0 & minute <= 59){
		this.minute = minute;
	}else {
		System.out.println("Not a Time");
	}
	if(second >=0 & second <=0){
		this.second = second;
	}else {
		System.out.println("Not a Time");
	}
}

	public String toString() {
        // Use built-in function String.format() to form a formatted String
        return String.format("%02d:%02d:%02d", hour, minute, second);
              // Specifier "0" to print leading zeros
   }
public Time nextSecond(){
	++second;
	if(second >= 60){
		second = 0;
		++minute ;	
		if(minute >= 60){
			minute = 0;
			++hour;		
			if(hour >= 24){
				hour = 0;				
			}
		}
	}
	return this; 
}

public Time previousSecond(){
	--second;
	if(second <= 0){
		--minute;
		second = 59;
		if(minute <= 0){
			--hour;
			minute = 59;
			if(hour <= 0){
				hour = 0;
				minute = 0;
				second = 0;
			}
		}
	}
	return this;
}


}
