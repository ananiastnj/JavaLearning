package WritingATest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployeeDetails {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employeeDetails = new EmployeeDetails();
	//test to check appraisal
	@Test
	public void testCalculateAppraisal(){
		employeeDetails.setName("Ananias");
		employeeDetails.setAge(27);
		employeeDetails.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
		assertEquals(500,appraisal, 0.0);
	}
	//test to check yearlySalary
	@Test
	public void testCalculateYearlySalary(){
		employeeDetails.setName("Ananias");
		employeeDetails.setAge(27);
		employeeDetails.setMonthlySalary(8000);
		double salary = empBusinessLogic.calculateYearlySalary(employeeDetails);
		assertEquals(96000 ,salary, 0.0);
	}
	
}
