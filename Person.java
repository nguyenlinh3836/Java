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
public class Person {
	private String name;
	private String adress;
	
	public Person(String name, String adress){
		this.name = name;
		this.adress = adress;
	}
	public String getName(){
		return this.name;
	}
	public String getAdress(){
		return this.adress;
	}
	public void setAdress(String adress){
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Person{" + "name=" + name + ", adress=" + adress + '}';
	}
	
}
