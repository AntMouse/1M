package m2_02_16;

enum OpenAndClose {
	OPEN, CLOSE
}

public class Test8_Q4_ParkManagement {
	private OpenAndClose openAndClose; // enum 변수 선언
	private Test8_Q1_Dino[] dino = new Test8_Q1_Dino[10];
	private Test8_Q2_Employee[] employee = new Test8_Q2_Employee[10];
	
	public Test8_Q4_ParkManagement() {
		
	}

	public void openAndClose(OpenAndClose openAndClose) {
		if (openAndClose == OpenAndClose.OPEN) {
			System.out.println("공원 문을 열었습니다.");
		} else if (openAndClose == OpenAndClose.CLOSE) {
			System.out.println("공원 문을 닫았습니다.");
		}
	}
	// 공룡 정보 추가
	public void dinoAdd(int index, String dinoNameAdd, int dinoAgeAdd, String dinoSpeciesAdd) {
		if (0 <= index && index < dino.length) {
            dino[index] = new Test8_Q1_Dino(dinoNameAdd, dinoAgeAdd, dinoSpeciesAdd);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
	}
	
	public void printDinoInfo(int index) {
		if (0 <= index && index < dino.length && dino[index] != null) {
            System.out.println("추가한 공룡 번호 : " + index);
            System.out.println("이름 : " + dino[index].getDinoName());
            System.out.println("나이 : " + dino[index].getDinoAge() + "살");
            System.out.println("종 : " + dino[index].getDinoSpecies());
        } else {
            System.out.println("유효하지 않은 인덱스이거나 추가된 공룡이 없습니다.");
        }
    }
	
	public void removeDino(int index) {
		if (0 <= index && index < dino.length && dino[index] != null) {
            System.out.println(dino[index].getDinoName() + "을(를) 공룡 목록에서 제거합니다.");
            dino[index] = null; // 공룡 제거
        } else {
            System.out.println("유효하지 않은 인덱스이거나 제거할 공룡이 없습니다.");
        }
    }
	
	
	
	// 공룡 정보 수정
	public void allChangeDino(int index, String dinoName, int dinoAge, String dinoSpecies) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	        dino[index].changeDinoName(dinoName);
	        dino[index].changeDinoAge(dinoAge);
	        dino[index].changeDinoSpecies(dinoSpecies);
	        System.out.println("공룡 정보가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 공룡이 없습니다.");
	    }
	}
	
	public void changeDinoName(int index, String newDinoName) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	        dino[index].changeDinoName(newDinoName);
	        System.out.println("공룡의 이름이 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 공룡이 없습니다.");
	    }
	}

	public void changeDinoAge(int index, int newDinoAge) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	        dino[index].changeDinoAge(newDinoAge);
	        System.out.println("공룡의 나이가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 공룡이 없습니다.");
	    }
	}

	public void changeDinoSpecies(int index, String newDinoSpecies) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	        dino[index].changeDinoSpecies(newDinoSpecies);
	        System.out.println("공룡의 종이 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 공룡이 없습니다.");
	    }
	}
	
	
	
	
	// 직원 정보 추가
	public void employeeAdd(int index, String employeeName, String employeeJobTitle, int employeeYearsOfExperience) {
		if (0 <= index && index < employee.length) {
            employee[index] = new Test8_Q2_Employee(employeeName, employeeJobTitle, employeeYearsOfExperience);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
	}
	
	public void printEmployeeInfo(int index) {
		if (0 <= index && index < employee.length && employee[index] != null) {
            System.out.println("추가한 직원 번호 : " + index);
            System.out.println("이름 : " + employee[index].getEmployeeName());
            System.out.println("직무 : " + employee[index].getEmployeeJobTitle());
            System.out.println("경력 : " + employee[index].getEmployeeYearsOfExperience() + "년");
        } else {
            System.out.println("유효하지 않은 인덱스이거나 추가된 직원이 없습니다.");
        }
    }
	
	public void removeEmployee(int index) {
		if (0 <= index && index < employee.length && employee[index] != null) {
            System.out.println(employee[index].getEmployeeName() + "을(를) 직원 목록에서 제거합니다.");
            employee[index] = null; // 직원 정보 제거
        } else {
            System.out.println("유효하지 않은 인덱스이거나 제거할 직원이 없습니다.");
        }
    }
	
	
	
	// 직원 정보 수정
	public void allChangeEmployee(int index, String newEmployeeName, String newEmployeeJobTitle, int newEmployeeYearsOfExperience) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	    	employee[index].changeEmployeeName(newEmployeeName);
	    	employee[index].changeEmployeeJobTitle(newEmployeeJobTitle);
	    	employee[index].changeEmployeeYearsOfExperience(newEmployeeYearsOfExperience);
	        System.out.println("직원 정보가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 직원이 없습니다.");
	    }
	}
	
	public void changeEmployeeName(int index, String newEmployeeName) {
	    if (0 <= index && index < employee.length && employee[index] != null) {
	        employee[index].changeEmployeeName(newEmployeeName);
	        System.out.println("직원의 이름이 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 직원이 없습니다.");
	    }
	}

	public void changeEmployeeJobTitle(int index, String newEmployeeJobTitle) {
	    if (0 <= index && index < employee.length && employee[index] != null) {
	        employee[index].changeEmployeeJobTitle(newEmployeeJobTitle);
	        System.out.println("직원의 직무가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 직원이 없습니다.");
	    }
	}

	public void changeEmployeeYearsOfExperience(int index, int newEmployeeYearsOfExperience) {
	    if (0 <= index && index < employee.length && employee[index] != null) {
	        employee[index].changeEmployeeYearsOfExperience(newEmployeeYearsOfExperience);
	        System.out.println("직원의 경력이 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 직원이 없습니다.");
	    }
	}

	
	
	public static void main(String[] args) {
		Test8_Q4_ParkManagement park = new Test8_Q4_ParkManagement();
		park.openAndClose(OpenAndClose.OPEN);
		System.out.println();
		park.dinoAdd(0, "점박이", 5, "익룡");
		park.printDinoInfo(0);
		System.out.println();
		park.dinoAdd(5, "바둑이", 7, "티라노");
		park.printDinoInfo(5);
		System.out.println();
		park.removeDino(0);
		park.printDinoInfo(0);
		System.out.println();
		System.out.println();
		park.employeeAdd(0, "김민수", "사육장 관리자",5);
		park.printEmployeeInfo(0);
		park.changeDinoName(5, "초록이");
		park.printDinoInfo(5);
		
	}

}
