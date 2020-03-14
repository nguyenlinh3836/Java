package Exam;

public class EmployeeFullTime extends SalaryPolicy {
   private float rate;
   public EmployeeFullTime(){
      this.rate = 4f;
   }
   @Override
   public float getSalary() {
      return super.getBaseSalary()*rate;
   }
}
