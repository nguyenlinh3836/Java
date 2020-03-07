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
public class Staff extends Person{
	private String school;
	private double pay;
	public Staff(String name , String adress , String school, double pay){
		super(name,adress);
		this.school = school;
		this.pay = pay;
	}
	public String getSchool(){
		return school;
	}
	public void setSchool(String school){
		this.school = school;
	}
	public double getPay(){
		return pay;
	}
	public void setPay(double pay){
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "Staff{" + "name="+ super.getName() +"school=" + school + ", pay=" + pay + '}';
	}
	
}
