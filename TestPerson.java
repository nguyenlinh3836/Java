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
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("Peter", "NY");
		p1.setAdress("LA");
		System.out.println(p1);
		Student s1 = new Student("John", "HN", "University", 2020, 1000);
		s1.setAdress("NY");
		s1.setFee(800);
		s1.setProgram("College");
		System.out.println(s1);
		Staff st1 = new Staff("Violet", "Texas", "MIT", 900);
		st1.setAdress("Paris");
		st1.setPay(3000);
		st1.setSchool("Stanford");
		System.out.println(st1);
		
	}
}
