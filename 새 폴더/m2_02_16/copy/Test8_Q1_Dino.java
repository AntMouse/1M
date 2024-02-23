package m2_02_16.copy;

public class Test8_Q1_Dino {
	private String dinoName;
	private int dinoAge;
	private String dinoSpecies;
	private String dinoStatus; // 공룡의 상태를 나타내는 필드 추가
    private String dinoLocation; // 공룡의 위치를 나타내는 필드 추가
	
	public Test8_Q1_Dino(String dinoName, int dinoAge, String dinoSpecies, String dinoStatus) {
		this.dinoName = dinoName;
		this.dinoAge = dinoAge;
		this.dinoSpecies = dinoSpecies;
		
		if (dinoSpecies.equals("티라노사우루스")) {
			this.dinoLocation = "티라노둥지";
		} else if (dinoSpecies.equals("기가노토사우루스")) {
			this.dinoLocation = "기가노토둥지";
		} else if (dinoSpecies.equals("타르보사우루스")) {
			this.dinoLocation = "타르보둥지";
		} else {
			this.dinoLocation = "보호둥지";
		}
		
		this.dinoStatus = dinoStatus;
	}
	
	public String getDinoName() {
		return dinoName;
	}
	public int getDinoAge() {
		return dinoAge;
	}	
	public String getDinoSpecies() {
		return dinoSpecies;
	}
	public String getDinoStatus() {
		return dinoStatus;
	}
	public String getDinoLocation() {
		return dinoLocation;
	}
	
	public void changeDinoName(String dinoName) {
		this.dinoName = dinoName;
	}	
	public void changeDinoAge(int dinoAge) {
		this.dinoAge = dinoAge;
	}	
	public void changeDinoSpecies(String dinoSpecies) {
		this.dinoSpecies = dinoSpecies;
	}
	public void changeDinoStatus(String dinoStatus) {
		this.dinoStatus = dinoStatus;
	}
	public void changeDinoLocation(String dinoLocation) {
		this.dinoLocation = dinoLocation;
	}
	
	public static void main(String[] args) {
		

	}

}
