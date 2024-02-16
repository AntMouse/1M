package m2_02_16;

public class Test8_Q8_Ticket {
	private int parkPrice;
	private String parkVisitorsName;
	private int parkVisitDate;
	
	public Test8_Q8_Ticket(int parkPrice, String parkVisitorsName, int parkVisitDate) {
		this.parkPrice = parkPrice;
		this.parkVisitorsName = parkVisitorsName;
		this.parkVisitDate = parkVisitDate;
	}
	
	public int getparkPrice() {
		return parkPrice;
	}
	public String getparkVisitorsName() {
		return parkVisitorsName;
	}	
	public int getparkVisitDate() {
		return parkVisitDate;
	}
	
	public void changeparkPrice(int parkPrice) {
		this.parkPrice = parkPrice;
	}	
	public void changeparkVisitorsName(String parkVisitorsName) {
		this.parkVisitorsName = parkVisitorsName;
	}	
	public void changeparkVisitDate(int parkVisitDate) {
		this.parkVisitDate = parkVisitDate;
	}

	public static void main(String[] args) {

	}

}
