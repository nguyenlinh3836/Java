package Exam;

abstract public class SalaryPolicy {
    private float baseSalary;
    public float getBaseSalary(){
        return baseSalary;
    }
    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }
    abstract public float getSalary();
}
