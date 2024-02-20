package m2_02_16;

public class Test8_Q6_Enclosure {
    private Test8_Q1_Dino[] dinosaurs;

    public Test8_Q6_Enclosure(int capacity) {
        dinosaurs = new Test8_Q1_Dino[capacity];
    }

    public void addDinosaur(Test8_Q1_Dino dinosaur, int index) {
        if (0 <= index && index < dinosaurs.length) {
            dinosaurs[index] = dinosaur;
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }

    public boolean isEnclosureSafe(int index) {
    	if (0 <= index && index < dinosaurs.length) {
            Test8_Q1_Dino dino = dinosaurs[index];
            if (dino != null) {
                if (dino.getDinoSpecies().equals("티라노사우루스")) {
                    System.out.println(index + "번 우리는 안전하지 않습니다. 티라노사우루스가 있습니다.");
                    return false;
                } else if (dino.getDinoSpecies().equals("기가노토사우루스")) {
                    System.out.println(index + "번 우리는 안전하지 않습니다. 기가노토사우루스가 있습니다.");
                    return false;
                } else if (dino.getDinoSpecies().equals("타르보사우루스")) {
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
        } else {
            System.out.println("유효하지 않은 우리 인덱스입니다.");
            return false;
        }
    }

    public static void main(String[] args) {
        Test8_Q6_Enclosure enclosure = new Test8_Q6_Enclosure(10);

        Test8_Q1_Dino dino1 = new Test8_Q1_Dino("바둑이", 15, "티라노사우루스");
        Test8_Q1_Dino dino2 = new Test8_Q1_Dino("점박이", 20, "모사사우루스");
        enclosure.addDinosaur(dino1, 0);
        enclosure.addDinosaur(dino2, 1);

        enclosure.isEnclosureSafe(0);
        enclosure.isEnclosureSafe(1);
    }
}
