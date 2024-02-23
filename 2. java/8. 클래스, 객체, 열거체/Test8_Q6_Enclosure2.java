package m2_02_16;

public class Test8_Q6_Enclosure2 {
	private Test8_Q1_Dino2 dinoQ1Date;
	private static int dinoCageCount = 0;

    public Test8_Q6_Enclosure2(String dinoName, int dinoAge, String dinoSpecies) {
    	dinoQ1Date = new Test8_Q1_Dino2(dinoName, dinoAge, dinoSpecies);
    }

    public boolean isEnclosureSafe2(int index) {
    	if (dinoQ1Date != null) {
    		if (dinoQ1Date.getDinoSpecies().equals("티라노사우루스")) {
    			System.out.println(index + "번 우리는 안전하지 않습니다. 티라노사우루스가 있습니다.");
    			return false;
    		} else if (dinoQ1Date.getDinoSpecies().equals("기가노토사우루스")) {
    			System.out.println(index + "번 우리는 안전하지 않습니다. 기가노토사우루스가 있습니다.");
    			return false;
    		} else if (dinoQ1Date.getDinoSpecies().equals("타르보사우루스")) {
    			System.out.println(index + "번 우리는 안전하지 않습니다. 타르보사우루스가 있습니다.");
    			return false;
    		} else {
    			System.out.println(index + "번 우리는 안전합니다.");
    			return true;
    		}
    	} else {
    		System.out.println(index + "번 우리는 비어 있습니다.");
    		return true;
    	}
    }  

    public static void main(String[] args) {
        Test8_Q6_Enclosure enclosure = new Test8_Q6_Enclosure(10);

        Test8_Q1_Dino2 dino1 = new Test8_Q1_Dino2("바둑이", 15, "티라노사우루스");
        Test8_Q1_Dino2 dino2 = new Test8_Q1_Dino2("점박이", 20, "모사사우루스");
        enclosure.addDinosaur(dino1, 0);
        enclosure.addDinosaur(dino2, 1);

        enclosure.isEnclosureSafe(0);
        enclosure.isEnclosureSafe(1);
    }

}
