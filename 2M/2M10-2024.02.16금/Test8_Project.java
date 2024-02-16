package m2_02_16;

import java.util.Scanner; 




	

public class Test8_Project {
	Scanner scanner = new Scanner(System.in);

	// 공룡, 종업원 관리 양식 불러오기
	private Test8_Q4_ParkManagement dinoAndEmployee = new Test8_Q4_ParkManagement();
	
	public void initialValue() {
		// 공룡 초기값
		dinoAndEmployee.dinoAdd(0, "첫째티라노", 4, "티라노사우루스");
		dinoAndEmployee.dinoAdd(1, "첫째기가노트", 7, "기가노토사우루스");
		dinoAndEmployee.dinoAdd(2, "둘째티라노", 6, "티라노사우루스");
		dinoAndEmployee.dinoAdd(3, "첫째타르보", 4, "타르보사우루스");
		dinoAndEmployee.dinoAdd(4, "둘째타르보", 10, "타르보사우루스");
		
		// 직원 초기값
		dinoAndEmployee.employeeAdd(0, "Kim", "사육장 관리자", 5);
		dinoAndEmployee.employeeAdd(1, "John", "파크 안내인", 7);
		dinoAndEmployee.employeeAdd(2, "Tom", "경비원", 2);
		dinoAndEmployee.employeeAdd(3, "Smith", "영양 관리사", 12);
		dinoAndEmployee.employeeAdd(4, "Dan", "사육장 관리자", 17);
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
			// checkParkStatus();
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
			
			dinoAndEmployee.dinoAdd(newDinoIndex, newDinoName, newDinoAge, newDinoSpecies);
			break;
			
		case 2:
			System.out.print("조회할 공룡의 관리 번호를 입력하세요 : ");
			int printDinoInfo = scanner.nextInt();
			scanner.nextLine();
			dinoAndEmployee.printDinoInfo(printDinoInfo);
			break;
			
		case 3:
			System.out.print("제거할 공룡의 관리 번호를 입력하세요 : ");
			int removeDino = scanner.nextInt();
			scanner.nextLine();
			dinoAndEmployee.removeDino(removeDino);
			break;
			
		case 4:
			System.out.print("정보를 수정할 공룡의 관리 번호를 입력하세요 : ");
			int changeDinoIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("1. 전체 정보 수정 2. 이름 수정 3. 나이 수정 4. 종 정보 수정");
			int secondMenuChoice = scanner.nextInt();
			
			String changeDinoName;
			int changeDinoAge;
			String changeDinoSpecies;
			
			switch (secondMenuChoice) {
			case 1:
				System.out.print("공룡 이름 수정 : ");
				changeDinoName = scanner.nextLine();
				
				System.out.print("공룡 나이 수정 : ");
				changeDinoAge = scanner.nextInt();
				scanner.nextLine();
				
				System.out.print("공룡 종 정보 수정 : ");
				changeDinoSpecies = scanner.nextLine();
				
				dinoAndEmployee.allChangeDino(changeDinoIndex, changeDinoName, changeDinoAge, changeDinoSpecies);
				break;
				
			case 2:
				System.out.print("공룡 이름 수정 : ");
				changeDinoName = scanner.nextLine();
				dinoAndEmployee.changeDinoName(changeDinoIndex, changeDinoName);
				break;
				
			case 3:
				System.out.print("공룡 나이 수정 : ");
				changeDinoAge = scanner.nextInt();
				scanner.nextLine();
				dinoAndEmployee.changeDinoAge(changeDinoIndex, changeDinoAge);
				break;
				
			case 4:
				System.out.print("공룡 종 정보 수정 : ");
				changeDinoSpecies = scanner.nextLine();
				dinoAndEmployee.changeDinoSpecies(changeDinoIndex, changeDinoSpecies);
				break;

			default:
				System.out.println("잘못된 값입니다.");
				break;
			}
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
	// 케이스 2 직원 관리
	public void manageEmployees() {
		System.out.println("1. 직원 정보 추가 2. 직원 정보 보기 3. 직원 제거 4. 직원 정보 수정");
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
			
			dinoAndEmployee.employeeAdd(newEmployeeIndex, newEmployeeName, newEmployeeJobTitle, newEmployeeYearsOfExperience);
			break;
			
		case 2:
			System.out.print("조회할 직원의 관리 번호를 입력하세요 : ");
			int printEmployeeInfo = scanner.nextInt();
			scanner.nextLine();
			dinoAndEmployee.printEmployeeInfo(printEmployeeInfo);
			break;
			
		case 3:
			System.out.print("제거할 직원의 관리 번호를 입력하세요 : ");
			int removeEmployee = scanner.nextInt();
			scanner.nextLine();
			dinoAndEmployee.removeEmployee(removeEmployee);
			break;
			
		case 4:
			System.out.print("정보를 수정할 직원의 관리 번호를 입력하세요 : ");
			int changeEmployeeIndex = scanner.nextInt();
			scanner.nextLine();
			
			System.out.println("1. 전체 정보 수정 2. 이름 수정 3. 직무 수정 4. 경력 수정");
			int secondMenuChoice = scanner.nextInt();
			
			String changeEmployeeName;
			String changeEmployeeJobTitle;
			int changeEmployeeYearsOfExperience;
			
			switch (secondMenuChoice) {
			case 1:
				System.out.print("직원 이름 수정 : ");
				changeEmployeeName = scanner.nextLine();
				
				System.out.print("직원 직무 수정 : ");
				changeEmployeeJobTitle = scanner.nextLine();
							
				System.out.print("직원 경력 수정 : ");
				changeEmployeeYearsOfExperience = scanner.nextInt();
				scanner.nextLine();				
				
				dinoAndEmployee.allChangeEmployee(changeEmployeeIndex, changeEmployeeName, changeEmployeeJobTitle, changeEmployeeYearsOfExperience);
				break;
				
			case 2:
				System.out.print("직원 이름 수정 : ");
				changeEmployeeName = scanner.nextLine();
				dinoAndEmployee.changeEmployeeName(changeEmployeeIndex, changeEmployeeName);
				break;
				
			case 3:
				System.out.print("직원 직무 수정 : ");
				changeEmployeeJobTitle = scanner.nextLine();
				
				dinoAndEmployee.changeEmployeeJobTitle(changeEmployeeIndex, changeEmployeeJobTitle);
				break;
				
			case 4:
				System.out.print("직원 경력 수정 : ");
				changeEmployeeYearsOfExperience = scanner.nextInt();
				scanner.nextLine();
				dinoAndEmployee.changeEmployeeYearsOfExperience(changeEmployeeIndex, changeEmployeeYearsOfExperience);
				break;

			default:
				System.out.println("잘못된 값입니다.");
				break;
			}
			break;
		default:
			System.out.println("잘못된 값입니다.");
			break;
		}
	}
	
	// 케이스 3 티켓 관리
	public void manageTickets() {
		
	}
	
}
