/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP04;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class Author {
	private String name;
	private String email;
	private char Gender;
	public Author(){
		
	}
	public Author(String name,String email,char gender){
		this.name = name;
		this.email = email;
		this.Gender = gender;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public void setEMail(String email ){
		this.email = email;
	}
	public char getGender(){
		return Gender;
	}

	@Override
	public String toString() {
		return "Author{" + "name=" + name + ", email=" + email + ", Gender=" + Gender + '}';
	}	
	
}

