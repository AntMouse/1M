package m2_02_16.copy;

public class Test8_Q1_Dino2 {
	private String dinoName;
	private int dinoAge;
	private String dinoSpecies;
	
	public Test8_Q1_Dino2(String dinoName, int dinoAge, String dinoSpecies) {
		this.dinoName = dinoName;
		this.dinoAge = dinoAge;
		this.dinoSpecies = dinoSpecies;
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
	
	public void changeDinoName(String dinoName) {
		this.dinoName = dinoName;
	}	
	public void changeDinoAge(int dinoAge) {
		this.dinoAge = dinoAge;
	}	
	public void changeDinoSpecies(String dinoSpecies) {
		this.dinoSpecies = dinoSpecies;
	}
	
	public static void main(String[] args) {
		

	}

}
