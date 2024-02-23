package m2_02_16;

public class Test8_Q8_Ticket {
	private int parkTicketPrice;
	private String parkTicketVisitorsName;
	private int parkTicketVisitDate;
	
	public Test8_Q8_Ticket(int parkTicketPrice, String parkTicketVisitorsName, int parkTicketVisitDate) {
		this.parkTicketPrice = parkTicketPrice;
		this.parkTicketVisitorsName = parkTicketVisitorsName;
		this.parkTicketVisitDate = parkTicketVisitDate;
	}
	
	public int getParkTicketPrice() {
		return parkTicketPrice;
	}
	public String getParkTicketVisitorsName() {
		return parkTicketVisitorsName;
	}	
	public int getParkTicketVisitDate() {
		return parkTicketVisitDate;
	}
	
	public void changeParkTicketPrice(int parkTicketPrice) {
		this.parkTicketPrice = parkTicketPrice;
	}	
	public void changeParkTicketVisitorsName(String parkTicketVisitorsName) {
		this.parkTicketVisitorsName = parkTicketVisitorsName;
	}	
	public void changeParkTicketVisitDate(int parkTicketVisitDate) {
		this.parkTicketVisitDate = parkTicketVisitDate;
	}

	public static void main(String[] args) {

	}

}
