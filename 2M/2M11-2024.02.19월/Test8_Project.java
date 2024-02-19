package m2_02_16;

import java.util.Scanner; 

public class Test8_Project {
	Scanner scanner = new Scanner(System.in);

	// 공룡, 종업원 관리 양식 불러오기
	private Test8_Q4_ParkManagement parkTotalManagement = new Test8_Q4_ParkManagement();
	
	public void initialValue() {
		// 공룡 초기값
		parkTotalManagement.dinoAdd(0, "첫째티라노", 4, "티라노사우루스", "양호");
		parkTotalManagement.dinoAdd(1, "첫째기가노트", 7, "기가노토사우루스", "양호");
		parkTotalManagement.dinoAdd(2, "둘째티라노", 6, "티라노사우루스", "주의");
		parkTotalManagement.dinoAdd(3, "첫째타르보", 4, "타르보사우루스", "양호");
		parkTotalManagement.dinoAdd(4, "둘째타르보", 10, "타르보사우루스", "주의");
		
		// 직원 초기값
		parkTotalManagement.employeeAdd(0, "Kim", "사육장 관리자", 5);
		parkTotalManagement.employeeAdd(1, "John", "파크 안내인", 7);
		parkTotalManagement.employeeAdd(2, "Tom", "경비원", 2);
		parkTotalManagement.employeeAdd(3, "Smith", "영양 관리사", 12);
		parkTotalManagement.employeeAdd(4, "Dan", "사육장 관리자", 17);
		
		// 티켓 초기값				
		parkTotalManagement.addParkTicket(0, 20000, "이재일", 20240219);				
		parkTotalManagement.addParkTicket(1, 20000, "김민수", 20240219);				
		parkTotalManagement.addParkTicket(2, 20000, "삼미빈", 20240219);
		parkTotalManagement.addParkTicket(3, 20000, "준사함", 20240219);		
		parkTotalManagement.addParkTicket(4, 20000, "힌종신", 20240219);
	}

	boolean mainMenu = false;

	public static void main(String[] args) {	
		Test8_Project main = new Test8_Project();
		main.initialValue(); // 초기값 설정
		main.start();
	}
	
	public void start() {
		// This is the main loop of the application. It
		// will keep running until the user decides to exit.
		do {
			displayMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			handleMenuChoice(choice);
			while (true) {
				System.out.print("메뉴를 다시 불러오기는 'M', 종료는 'E'를 입력 : ");
				String menuRestart = scanner.nextLine();
				if (menuRestart.equals("M") || menuRestart.equals("m")) {
					mainMenu = true;
					System.out.println();
					break;
				} else if (menuRestart.equals("E") || menuRestart.equals("e")) {
					System.out.print("프로그램을 종료합니다.");
					mainMenu = false;
					break;
				} else {
					System.out.println("잘못된 값입니다. 다시 입력해주세요.");
				}
			}
		} while (mainMenu);
	}
	
	public void displayMenu() {
		System.out.println("Welcome to Mesozoic Eden ParkManager!");
		System.out.println("1. Manage Dinosaurs");
		System.out.println("2. Manage Park Employees");
		System.out.println("3. Manage Tickets");
		System.out.println("4. Check Park Status");
		System.out.println("5. Handle Special Events");
		System.out.println("6. Exit");
		System.out.print("Enter your choice: ");
	}
	
	public void handleMenuChoice(int choice) {
		switch (choice) {
		case 1:
			manageDinosaurs();
			break;
		case 2:
			manageEmployees();
			break;
		case 3:
			manageTickets();
			break;
		case 4:
			checkParkStatus();
			break;
		case 5:
			// handleSpecialEvents();
			break;
		case 6:
			System.out.println("Exiting...");
			System.exit(0);
			break;
		default:
			break;
		}	
	}
	
	// 케이스 1 공룡 관리
	public void manageDinosaurs() {
		System.out.println("1. 공룡 정보 추가 2. 공룡 정보 보기 3. 공룡 제거 4. 공룡 정보 수정");
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice) {
		case 1:
			System.out.print("추가할 공룡의 관리 번호를 설정하세요 : ");
			int newDinoIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("추가할 공룡의 이름을 지어주세요 : ");
			String newDinoName = scanner.nextLine();
			
			System.out.print("추가할 공룡의 나이를 입력하세요 : ");
			int newDinoAge = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("추가할 공룡의 종을 적어주세요 : ");
			String newDinoSpecies = scanner.nextLine();
			
			System.out.print("추가할 공룡의 현재 상태를 적어주세요 : ");
			String newDinoStatus = scanner.nextLine();
			
			parkTotalManagement.dinoAdd(newDinoIndex, newDinoName, newDinoAge, newDinoSpecies, newDinoStatus);
			break;
			
		case 2:
			System.out.print("조회할 공룡의 관리 번호를 입력하세요 : ");
			int printDinoInfo = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.printDinoInfo(printDinoInfo);
			break;
			
		case 3:
			System.out.print("제거할 공룡의 관리 번호를 입력하세요 : ");
			int removeDino = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.removeDino(removeDino);
			break;
			
		case 4:
			System.out.print("정보를 수정할 공룡의 관리 번호를 입력하세요 : ");
			int changeDinoIndex = scanner.nextInt();
			scanner.nextLine();
			
		    System.out.print("공룡 이름 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeDinoName = scanner.nextLine();

		    System.out.print("공룡 나이 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String ageInput = scanner.nextLine();
		    int changeDinoAge;
		    if (!ageInput.isEmpty()) {
		        changeDinoAge = Integer.parseInt(ageInput);
		    } else {
		        changeDinoAge = -1; // 나이를 -1로 설정하여 입력이 없음을 나타냄
		    }

		    System.out.print("공룡 종 정보 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeDinoSpecies = scanner.nextLine();
		    
		    System.out.print("공룡 상태 정보 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeDinoStatus = scanner.nextLine();
		    
		    System.out.print("공룡 위치 정보 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeDinoLocation = scanner.nextLine();
		    
		    // 정보 종합 후 정보 수정 판단
		    if (!changeDinoName.isEmpty() || changeDinoAge != -1 || !changeDinoSpecies.isEmpty() || !changeDinoStatus.isEmpty() || !changeDinoLocation.isEmpty()) {
				parkTotalManagement.allChangeDino(changeDinoIndex, changeDinoName, changeDinoAge, changeDinoSpecies, changeDinoStatus, changeDinoLocation);
			} else {
		        System.out.println("수정된 정보가 없습니다. 공룡 정보가 그대로 유지됩니다.");
		    }
		    break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
	// 케이스 2 직원 관리
	public void manageEmployees() {
		System.out.println("1. 직원 정보 추가 2. 직원 정보 보기 3. 직원 제거 4. 직원 정보 수정 5. 직원 스케줄 관리");
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice) {
		case 1:
			System.out.print("추가할 직원의 관리 번호를 설정하세요 : ");
			int newEmployeeIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("추가할 직원의 이름을 입력하세요 : ");
			String newEmployeeName = scanner.nextLine();
			
			System.out.print("추가할 직원의 직무를 입력하세요 : ");
			String newEmployeeJobTitle = scanner.nextLine();
			
			System.out.print("추가할 직원의 경력을 입력하세요 : ");
			int newEmployeeYearsOfExperience = scanner.nextInt();
			scanner.nextLine();
			
			parkTotalManagement.employeeAdd(newEmployeeIndex, newEmployeeName, newEmployeeJobTitle, newEmployeeYearsOfExperience);
			break;
			
		case 2:
			System.out.print("조회할 직원의 관리 번호를 입력하세요 : ");
			int printEmployeeInfo = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.printEmployeeInfo(printEmployeeInfo);
			break;
			
		case 3:
			System.out.print("제거할 직원의 관리 번호를 입력하세요 : ");
			int removeEmployee = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.removeEmployee(removeEmployee);
			break;
			
		case 4:
			System.out.print("정보를 수정할 직원의 관리 번호를 입력하세요 : ");
			int changeEmployeeIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("직원 이름 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeEmployeeName = scanner.nextLine();
		    
		    System.out.print("직원 직무 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeEmployeeJobTitle = scanner.nextLine();

		    System.out.print("직원 경력 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String YearsOfExperienceInput = scanner.nextLine();
		    int changeEmployeeYearsOfExperience;
		    if (!YearsOfExperienceInput.isEmpty()) {
		    	changeEmployeeYearsOfExperience = Integer.parseInt(YearsOfExperienceInput);
		    } else {
		    	changeEmployeeYearsOfExperience = -1; // 경력을 -1로 설정하여 입력이 없음을 나타냄
		    }
		    		    
		    // 정보 종합 후 정보 수정 판단
		    if (!changeEmployeeName.isEmpty() || !changeEmployeeJobTitle.isEmpty() || changeEmployeeYearsOfExperience != -1) {
				parkTotalManagement.allChangeEmployee(changeEmployeeIndex, changeEmployeeName, changeEmployeeJobTitle, changeEmployeeYearsOfExperience);
			} else {
		        System.out.println("수정된 정보가 없습니다. 공룡 정보가 그대로 유지됩니다.");
		    }
		    	    						
			break;
			
		case 5:
			System.out.print("스케줄을 확인할 직원의 관리 번호를 입력하세요 : ");
			int EmployeeScheduleIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("1. 해당 직원 스케줄 확인 2. 해당 직원 스케줄 수정");
			int EmployeeScheduleChoice = scanner.nextInt();
			scanner.nextLine();
			
			if (EmployeeScheduleChoice == 1) {
				parkTotalManagement.getEmployeeSchedule(EmployeeScheduleIndex);
			} else if (EmployeeScheduleChoice == 2) {
				System.out.print("일정을 바꿀 시간을 입력하세요 : ");
				int EmployeeScheduleTime = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("일정을 적어주세요.");
				String EmployeeScheduleChange = scanner.nextLine();
				
				parkTotalManagement.changeEmployeeSchedule(EmployeeScheduleIndex, EmployeeScheduleTime, EmployeeScheduleChange);
			}
			
			
			
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
	// 케이스 3 티켓 관리
	public void manageTickets() {
		System.out.println("1. 티켓 정보 추가 2. 티켓 정보 보기 3. 티켓 제거 4. 티켓 정보 수정");
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice) {
		case 1:
			System.out.print("추가할 티켓의 관리 번호를 설정하세요 : ");
			int newParkTicketIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("추가할 티켓의 가격을 입력하세요 (수정하지 않으려면 엔터를 누르세요) : ");
			int newParkTicketPrice = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("추가할 티켓을 구매한 고객의 이름을 입력하세요 (수정하지 않으려면 엔터를 누르세요) : ");
			String newParkTicketVisitorsName = scanner.nextLine();
			
			System.out.print("추가할 티켓의 방문 날짜를 입력하세요 (수정하지 않으려면 엔터를 누르세요) : ");
			int newParkTicketVisitDate = scanner.nextInt();
			scanner.nextLine();
			
			parkTotalManagement.addParkTicket(newParkTicketIndex, newParkTicketPrice, newParkTicketVisitorsName, newParkTicketVisitDate);
			break;
			
		case 2:
			System.out.print("조회할 티켓의 관리 번호를 입력하세요 : ");
			int printParkTicketInfo = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.printParkTicketInfo(printParkTicketInfo);
			break;
			
		case 3:
			System.out.print("제거할 티켓의 관리 번호를 입력하세요 : ");
			int removeParkTicket = scanner.nextInt();
			scanner.nextLine();
			parkTotalManagement.removeParkTicket(removeParkTicket);
			break;
			
		case 4:
			System.out.print("정보를 수정할 티켓의 관리 번호를 입력하세요 : ");
			int changeParkTicketIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("티켓 가격 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String ParkTicketPriceInput = scanner.nextLine();
		    int changeParkTicketPrice;
		    if (!ParkTicketPriceInput.isEmpty()) {
		    	changeParkTicketPrice = Integer.parseInt(ParkTicketPriceInput);
			} else {
				changeParkTicketPrice = -1;
			}
		    
		    System.out.print("티켓 구매 고객 이름 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String changeParkTicketVisitorsName = scanner.nextLine();

		    System.out.print("티켓 방문 날짜 수정 (수정하지 않으려면 엔터를 누르세요): ");
		    String ParkTicketVisitDateInput = scanner.nextLine();
		    int changeParkTicketVisitDate;
		    if (!ParkTicketVisitDateInput.isEmpty()) {
		    	changeParkTicketVisitDate = Integer.parseInt(ParkTicketVisitDateInput);
			} else {
				changeParkTicketVisitDate = -1;
			}
	    		    
		    // 정보 종합 후 정보 수정 판단
		    if (changeParkTicketPrice != -1 || !changeParkTicketVisitorsName.isEmpty() || changeParkTicketVisitDate != -1) {
		    	parkTotalManagement.allChangeParkTicket(changeParkTicketIndex, changeParkTicketPrice, changeParkTicketVisitorsName, changeParkTicketVisitDate);
			} else {
		        System.out.println("수정된 정보가 없습니다. 티켓 정보가 그대로 유지됩니다.");
		    }    	    						
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
	// 케이스 4 공원 상태 (공룡 위치/상태 표시, 직원의 스케쥴 관리)
	public void checkParkStatus() {
		System.out.println("1. 공룡 상태 및 위치 보기 2. 직원 스케줄 관리");
		int menuChoice = scanner.nextInt();
		
		switch (menuChoice) {
		case 1:
			int dinoAmount = parkTotalManagement.dinoAmountCheck();
			for (int i = 0; i < dinoAmount; i++) {
				parkTotalManagement.printDinoInfo(i);

				System.out.println("=========================");
			}
			scanner.nextLine();			
			break;
			
		case 2:
			System.out.print("스케줄을 조정할 직원 번호를 입력해주세요 : ");
			int employeeIndex = scanner.nextInt();
			System.out.println("============직원 정보============");
			parkTotalManagement.printEmployeeInfo(employeeIndex);
			System.out.println();
			System.out.println("수정 사항을 입력해주세요.");
			scanner.nextLine();	
			
			String scheduleRevise = scanner.nextLine();
			System.out.println("수정 사항이 반영되었습니다..");
			break;

		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
}
