package week1day2;

import java.util.Arrays;

public class Findsecondlargestelement {

	public static void main(String[] args) {
		
		int[] arr = {3,2,11,4,6,7};
		int length = arr.length;
        Arrays.sort(arr);
        System.out.println("The second largest number:"+ arr[length-2]);
	}
}
