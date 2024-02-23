package m2_02_08;

import java.util.Arrays;

public class Test6_11 {

	public static void main(String[] args) {
		int[] originalArray = {10,20,30,40,50};
		int newLength = 7;
		int[] resizedArray = Arrays.copyOf(originalArray, newLength);
		System.out.println("Original array : " + Arrays.toString(originalArray));
		System.out.println("Resized array : " + Arrays.toString(resizedArray));
		

	}

}
