package week1day2;

public class Charoccurence {

	
	public static void main(String[] args) {
		String str = "welcome to chennai";
		char search='n';
		char[] charArray = str.toCharArray();
		for( int i=0;i<charArray.length;i++) {
		System.out.println("charArray["+i+"]" +charArray [i]);
		}
		int count=0;
		for( int j=0;j<str.length();j++) { 
		if(str.charAt(j)==search) 
			count++;}
			System.out.println("the character " +search+ "  appears " +count+ " times ");
		}
	


}

