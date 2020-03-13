/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Nguyen Hoang Linh
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("The name is: " + s1.getName() );
        System.out.println("GPA:" + s1.getGPA());
        
        Student s2 = new Student("Peter Tan",3.9);
        System.out.println("the name is :" + s2.getName());
        System.out.println("GPA:" +s2.getGPA());    
        
    }
}
