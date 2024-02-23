package m2_02_16.copy;

public class Test8_Q8_TicketManagement {
	private Test8_Q8_Ticket[] tickets;
	
	public Test8_Q8_TicketManagement() {
		this.tickets = new Test8_Q8_Ticket[10]; // 티켓 배열 초기화
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
	
	

}
