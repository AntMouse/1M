package m2_02_07;

public class Test5_14_Q1 {

	public static void main(String[] args) {
		String[] dinoId = new String[100];
		
		for (int i = 0; i < dinoId.length; i++) {
			dinoId[i] = "dino_" + (i + 1);		
			System.out.println("공룡 ID : " + dinoId[i]);
		}

	}

}
