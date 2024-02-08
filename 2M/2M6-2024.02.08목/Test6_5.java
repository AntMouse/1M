package m2_02_08;

public class Test6_5 {

	public static void main(String[] args) {
		int[][] matrix = { 
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		for (int[] row : matrix) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}
