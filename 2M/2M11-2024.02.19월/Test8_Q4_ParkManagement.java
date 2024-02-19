package m2_02_16;

enum OpenAndClose {
	OPEN, CLOSE
}

public class Test8_Q4_ParkManagement {
	private OpenAndClose openAndClose; // enum 변수 선언
	private Test8_Q1_Dino[] dino = new Test8_Q1_Dino[10];
	private Test8_Q2_Employee[] employee = new Test8_Q2_Employee[10];
	private Test8_Q8_Ticket[] tickets = new Test8_Q8_Ticket[10];
	private static int dinoAmount;

	public void openAndClose(OpenAndClose openAndClose) {
		if (openAndClose == OpenAndClose.OPEN) {
			System.out.println("공원 문을 열었습니다.");
		} else if (openAndClose == OpenAndClose.CLOSE) {
			System.out.println("공원 문을 닫았습니다.");
		}
	}
	// 공룡 정보 추가
	public void dinoAdd(int index, String dinoNameAdd, int dinoAgeAdd, String dinoSpeciesAdd, String dinoStatusAdd) {
		if (0 <= index && index < dino.length) {
            dino[index] = new Test8_Q1_Dino(dinoNameAdd, dinoAgeAdd, dinoSpeciesAdd, dinoStatusAdd);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
	}
	
	public void printDinoInfo(int index) {
		if (0 <= index && index < dino.length && dino[index] != null) {
            System.out.println("공룡 번호 : " + index);
            System.out.println("이름 : " + dino[index].getDinoName());
            System.out.println("나이 : " + dino[index].getDinoAge() + "살");
            System.out.println("종 : " + dino[index].getDinoSpecies()); 
            System.out.println("상태 : " + dino[index].getDinoStatus()); 
            System.out.println("위치 : " + dino[index].getDinoLocation()); 
        } else {
            System.out.println("유효하지 않은 인덱스이거나 추가된 공룡이 없습니다.");
        }
    }
	
	public void removeDino(int index) {
		if (0 <= index && index < dino.length && dino[index] != null) {
            System.out.println(dino[index].getDinoName() + "을(를) 공룡 목록에서 제거합니다.");
            dino[index] = null; // 공룡 제거'
        } else {
            System.out.println("유효하지 않은 인덱스이거나 제거할 공룡이 없습니다.");
        }
    }
	
	public int dinoAmountCheck() {
		dinoAmount = 0;
		for (int i = 0; i < dino.length; i++) {
			if (dino[i] != null) {
				dinoAmount++;
			}
		}
		return dinoAmount;
	}
	
	// 공룡 정보 수정
	public void allChangeDino(int index, String dinoName, int dinoAge, String dinoSpecies, String dinoStatus, String dinoLocation) {
	    if (0 <= index && index < dino.length && dino[index] != null) {
	        // 기존의 값을 가져옴
	        String prevDinoName = dino[index].getDinoName();
	        int prevDinoAge = dino[index].getDinoAge();
	        String prevDinoSpecies = dino[index].getDinoSpecies();
	        String prevDinoStatus = dino[index].getDinoStatus();
	        String prevDinoLocation = dino[index].getDinoLocation();
	        
	        // 입력된 값이 비어있지 않으면 새 값으로 수정, 비어있으면 기존 값으로 유지
	        if (!dinoName.isEmpty()) {
	            dino[index].changeDinoName(dinoName);
	        } else {
	            dino[index].changeDinoName(prevDinoName);
	        }
	        
	        if (dinoAge != -1) {
	            dino[index].changeDinoAge(dinoAge);
	        } else {
	            dino[index].changeDinoAge(prevDinoAge);
	        }
	        
	        if (!dinoSpecies.isEmpty()) {
	            dino[index].changeDinoSpecies(dinoSpecies);
	        } else {
	            dino[index].changeDinoSpecies(prevDinoSpecies);
	        }
	        
	        if (!dinoStatus.isEmpty()) {
	            dino[index].changeDinoStatus(dinoStatus);
	        } else {
	            dino[index].changeDinoStatus(prevDinoStatus);
	        }
	        
	        if (!dinoLocation.isEmpty()) {
	            dino[index].changeDinoLocation(dinoLocation);
	        } else {
	            dino[index].changeDinoLocation(prevDinoLocation);
	        }
	        System.out.println("공룡 정보가 성공적으로 수정되었습니다.");
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
            System.out.println("직원 번호 : " + index);
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
	    if (0 <= index && index < employee.length && employee[index] != null) {
	    	// 기존의 값을 가져옴
	    	String prevEmployeeName = employee[index].getEmployeeName();
	        String prevEmployeeJobTitle = employee[index].getEmployeeJobTitle();
	        int prevEmployeeYearsOfExperience = employee[index].getEmployeeYearsOfExperience();
	    	
	        // 입력된 값이 비어있지 않으면 새 값으로 수정, 비어있으면 기존 값으로 유지
	        if (!newEmployeeName.isEmpty()) {
	        	employee[index].changeEmployeeName(newEmployeeName);
	        } else {
	        	employee[index].changeEmployeeName(prevEmployeeName);
	        }
	        
	        if (!newEmployeeJobTitle.isEmpty()) {
	        	employee[index].changeEmployeeJobTitle(newEmployeeJobTitle);
	        } else {
	        	employee[index].changeEmployeeJobTitle(prevEmployeeJobTitle);
	        }
	        
	        if (newEmployeeYearsOfExperience != -1) {
	        	employee[index].changeEmployeeYearsOfExperience(newEmployeeYearsOfExperience);
	        } else {
	        	employee[index].changeEmployeeYearsOfExperience(prevEmployeeYearsOfExperience);
	        }
	        System.out.println("직원 정보가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 직원이 없습니다.");
	    }
	}	
    public void getEmployeeSchedule(int index) {
    	employee[index].getEmployeeSchedule();
    }
    public void changeEmployeeSchedule(int index, int hour, String task) {
    	employee[index].changeEmployeeSchedule(hour, task);
    }
	
	
	// 티켓 정보 추가
    public void addParkTicket(int index, int parkTicketPrice, String parkTicketVisitorsName, int parkTicketVisitDate) {
        if (0 <= index && index < tickets.length) {
            tickets[index] = new Test8_Q8_Ticket(parkTicketPrice, parkTicketVisitorsName, parkTicketVisitDate);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
    
    public void printParkTicketInfo(int index) {
		if (0 <= index && index < tickets.length && tickets[index] != null) {
            System.out.println("티켓 번호 : " + index);
            System.out.println("티켓 가격 : " + tickets[index].getParkTicketPrice());
            System.out.println("방문자 이름 : " + tickets[index].getParkTicketVisitorsName());
            System.out.println("방문 일자 : " + tickets[index].getParkTicketVisitDate());
        } else {
            System.out.println("유효하지 않은 인덱스이거나 해당하는 티켓이 없습니다.");
        }
    }
    
    public void removeParkTicket(int index) {
		if (0 <= index && index < tickets.length && tickets[index] != null) {
			tickets[index] = null;
            System.out.println(index + " 번 티켓을 제거합니다.");
        } else {
            System.out.println("유효하지 않은 인덱스이거나 제거할 티켓이 없습니다.");
        }
    }
	
	
	
	// 티켓 정보 수정
	public void allChangeParkTicket(int index, int parkTicketPrice, String parkTicketVisitorsName, int parkTicketVisitDate) {
	    if (0 <= index && index < tickets.length && tickets[index] != null) {
	    	// 기존의 값을 가져옴
	    	int prevParkTicketPrice = tickets[index].getParkTicketPrice();
	    	String prevParkTicketVisitorsName = tickets[index].getParkTicketVisitorsName();
	    	int prevParkTicketVisitDate = tickets[index].getParkTicketVisitDate();
	    	
	    	// 입력된 값이 비어있지 않으면 새 값으로 수정, 비어있으면 기존 값으로 유지
	    	if (parkTicketPrice != -1) {
				tickets[index].changeParkTicketPrice(parkTicketPrice);
			} else {
				tickets[index].changeParkTicketPrice(prevParkTicketPrice);
			}
	    	
	    	if (!parkTicketVisitorsName.isEmpty()) {
				tickets[index].changeParkTicketVisitorsName(parkTicketVisitorsName);
			} else {
				tickets[index].changeParkTicketVisitorsName(prevParkTicketVisitorsName);
			}
	    	
	    	if (parkTicketVisitDate != -1) {
				tickets[index].changeParkTicketVisitDate(parkTicketVisitDate);
			} else {
				tickets[index].changeParkTicketVisitDate(prevParkTicketVisitDate);
			}
	        System.out.println("티켓 정보가 성공적으로 수정되었습니다.");
	    } else {
	        System.out.println("유효하지 않은 인덱스이거나 수정할 티켓이 없습니다.");
	    }
	}
	
	
		
	public static void main(String[] args) {
		Test8_Q4_ParkManagement park = new Test8_Q4_ParkManagement();
		park.openAndClose(OpenAndClose.OPEN);
		
	}

}
