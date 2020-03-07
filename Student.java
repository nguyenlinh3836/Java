/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP08;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	public Student(String name , String adress, String program , int year , double fee){
		super(name,adress);
		this.program = program;
		this.year = year;
		this.fee = fee;		
	}
	public String getProgram(){
		return program;
	}
	public void setProgram(String program){
		this.program = program;
	}
	public int getYear(){
		return this.year;
	}
	public void setYear(){
		this.year = year;
	}
	public double getFee(){
		return fee;
	}
	public void setFee(double fee){
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Student{" + "name = "+ super.getName() + ", adress="+super.getAdress() + ",program=" + program + ", year=" + year + ", fee=" + fee + '}';
	}

	
}
