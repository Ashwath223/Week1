package week1day2;

import java.util.Iterator;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int [] value1 = {3,2,11,4,6,7}; 
		int [] value2= {1,2,8,4,9,7};
		
		int length = value1.length;
		int length1 = value2.length;
		
		for (int i = 0; i <length; i++) {
        for (int j = 0; j <length1; j++) {
        	if (value1[i]==value2[i]) {
        		System.out.println(i+"it is intersecting");
				
			}
			
		}			
		}
		
		
	}

}
