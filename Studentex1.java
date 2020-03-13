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
public class Student {
    private String name ;
    private double gpa ; 
    
    public Student() {
     name ="Paul lee";
     gpa = 3.5;     
}
    public Student(String c,double a){
        name = c;
        gpa = a;
    }
    public String getName() {
    return name;
}
    public double getGPA(){
        return gpa;
    }
}
