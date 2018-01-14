package WritingATest;

public class EmployeeDetails {
	private String name;
	private double monthlySalary;
	private int age;
	/**
	 * @return the name
	 */
	public String getName(){ return name; }
	public double getMonthlySalary(){return monthlySalary;}
	public int getAge(){ return age; }
	
	public void setName(String name){
		this.name = name;
	}
	public void setMonthlySalary(double monthlySalary){
		this.monthlySalary = monthlySalary;
	}
	public void setAge(int a){
		age = a;
	}
}
