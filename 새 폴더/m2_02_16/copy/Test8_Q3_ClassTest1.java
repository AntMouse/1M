package m2_02_16.copy;

public class Test8_Q3_ClassTest1 {

	public static void main(String[] args) {
		Test8_Q1_Dino2 dino = new Test8_Q1_Dino2("바둑이", 4, "티라노");
		Test8_Q2_Employee employee = new Test8_Q2_Employee("김민수", "티라노 사육장 관리", 20);
		
		
		System.out.println("공룡 이름 : " + dino.getDinoName());
		System.out.println("공룡 나이 : " + dino.getDinoAge() + "살");
		System.out.println("공룡 종류 : " + dino.getDinoSpecies());
		
		System.out.println();
		
		System.out.println("직원 이름 : " + employee.getEmployeeName());
		System.out.println("직원 직무 : " + employee.getEmployeeJobTitle());
		System.out.println("직원 경력 : " + employee.getEmployeeYearsOfExperience() + "년");
	}

}
