package Exam;

public class EmployeeParttime extends SalaryPolicy{
    private float rate;
    public EmployeeParttime(){
        this.rate = 2.5f;
    }
    @Override
    public float getSalary() {
        return getBaseSalary()*rate;
    }
}
