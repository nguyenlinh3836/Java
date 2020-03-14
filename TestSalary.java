package Exam;

import java.util.Scanner;

public class TestSalary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        EmployeeFullTime full1 = new EmployeeFullTime();
        EmployeeParttime part1 = new EmployeeParttime();
        System.out.println("Input Base salary full-time employee:");
        full1.setBaseSalary(in.nextFloat());
        System.out.println("Input Base salary part-time employee:");
        part1.setBaseSalary(in.nextFloat());
        System.out.println("salary employee fulltime is : " + full1.getSalary());
        System.out.println("salary employee parttime is :" + part1.getSalary());
    }
}
