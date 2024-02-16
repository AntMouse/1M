package m2_02_16;

public class Test8_Q8_TicketManagement {
	private Test8_Q8_Ticket[] tickets;
	
	public Test8_Q8_TicketManagement() {
		this.tickets = new Test8_Q8_Ticket[10]; // 티켓 배열 초기화
        initializeData(); // 데이터 초기화 메서드 호출
	}

    // 티켓 생성 메서드
    public void addTicket(int index, int parkPrice, String parkVisitorsName, int parkVisitDate) {
        if (0 <= index && index < tickets.length) {
            tickets[index] = new Test8_Q8_Ticket(parkPrice, parkVisitorsName, parkVisitDate);
            System.out.println("티켓이 추가되었습니다.");
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    // 티켓 수정 메서드
    public void changeTicket(int index, int parkPrice, String parkVisitorsName, int parkVisitDate) {
        if (index >= 0 && index < tickets.length && tickets[index] != null) {
            tickets[index].setParkPrice(parkPrice);
            tickets[index].setParkVisitorsName(parkVisitorsName);
            tickets[index].setParkVisitDate(parkVisitDate);
            System.out.println("티켓이 수정되었습니다.");
        } else {
            System.out.println("유효하지 않은 인덱스이거나 수정할 티켓이 없습니다.");
        }
    }

    // 티켓 삭제 메서드
    public void removeTicket(int index) {
        if (index >= 0 && index < tickets.length && tickets[index] != null) {
            tickets[index] = null;
            System.out.println("티켓이 삭제되었습니다.");
        } else {
            System.out.println("유효하지 않은 인덱스이거나 삭제할 티켓이 없습니다.");
        }
    }

    // 데이터 초기화 메서드
    private void initializeData() {
        // 여기서는 간단한 예시로 데이터를 하드코딩하여 초기화합니다.
        addTicket(0, 5000, "John Doe", 20240216);
        addTicket(1, 7000, "Jane Smith", 20240217);
    }

    public static void main(String[] args) {
        Test8_Q4_ParkManagement park = new Test8_Q4_ParkManagement();
        // 티켓 관련 기능 테스트
        park.addTicket(2, 10000, "Alice", 20240218);
        park.changeTicket(0, 5500, "John Doe", 20240216); // John Doe의 티켓 수정
        park.removeTicket(1); // Jane Smith의 티켓 삭제
    }

}
