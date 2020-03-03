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
public class TestBook {
	public static void main(String[] args) {
		Author a1 = new Author("Dave", "dave@gmail.com", 'm');
		a1.setEMail("dave@edu.com");
		Author[] authors = new Author[2];
		authors[0] = new Author("Tan Ah", "Ah@gmail.com", 'm');
		authors[1] = new Author("Paul", "Paul@nowhere.com", 'm');
		Book newbook = new Book("Java of dummy", authors, 19.59,99);
		System.out.println(newbook);
		System.out.println("Name is :" + authors[1].getName());
		System.out.println("Email is :" + authors[1].getEmail());
		System.out.println("Price is " + newbook.getPrice());
		authors.toString();
		
		
		
		
		
		
		
		
		
	}
	
	
}
