package TestNGTutorial;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
	EmpBussinessLogic empBussinessLogic = new EmpBussinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
  @Test
  public void testCalculateAppraisal() {
	  employee.setName("Antony");
	  employee.setAge(27);
	  employee.setMonthlySalary(8000);
	  double appraisal = empBussinessLogic.calculateAppraisal(employee);
	  Assert.assertEquals(500, appraisal, 0.0, "500");
  }
  @Test
  public void testCalculateYearlySalary(){
	  employee.setName("Ananias");
	  employee.setAge(28);
	  employee.setMonthlySalary(10000);
	  double salary = empBussinessLogic.calculateYearlySalary(employee);
	  Assert.assertEquals(120000, salary, 0.0, "10000");
  }
}
