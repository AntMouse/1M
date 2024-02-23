package m2_02_16.copy;

public class Test8_Q2_Employee2 {
	private String employeeName;
	private String employeeJobTitle;
	private int employeeYearsOfExperience;
	
	public Test8_Q2_Employee2(String employeeName, String employeeJobTitle, int employeeYearsOfExperience) {
		this.employeeName = employeeName;
		this.employeeJobTitle = employeeJobTitle;
		this.employeeYearsOfExperience = employeeYearsOfExperience;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	public String getEmployeeJobTitle() {
		return this.employeeJobTitle;
	}
	public int getEmployeeYearsOfExperience() {
		return this.employeeYearsOfExperience;
	}
	
	public void changeEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public void changeEmployeeJobTitle(String employeeJobTitle) {
		this.employeeJobTitle = employeeJobTitle;
	}
	public void changeEmployeeYearsOfExperience(int employeeYearsOfExperience) {
		this.employeeYearsOfExperience = employeeYearsOfExperience;
	}
	
	public static void main(String[] args) {
		

	}

}
