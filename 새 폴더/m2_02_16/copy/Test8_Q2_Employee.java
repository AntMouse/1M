package m2_02_16.copy;

public class Test8_Q2_Employee {
	private String employeeName;
	private String employeeJobTitle;
	private int employeeYearsOfExperience;
	private String[] employeeSchedule = new String[24];
	
	public Test8_Q2_Employee(String employeeName, String employeeJobTitle, int employeeYearsOfExperience) {
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
    public void getEmployeeSchedule() {
    	for (int i = 0; i < employeeSchedule.length; i++) {
			if (employeeSchedule[i] != null) {
				System.out.println((i) + "시 업무 : " + employeeSchedule[i]);
			}
		}
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
    public void changeEmployeeSchedule(int hour, String task) {
        if (0 <= hour && hour < 24) {
            employeeSchedule[hour] = task;
        } else {
            System.out.println("유효하지 않은 시간입니다.");
        }
    }
	
	public static void main(String[] args) {
		

	}

}
