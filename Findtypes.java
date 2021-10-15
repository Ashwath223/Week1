package week1day2;

public class Findtypes {

	public static void main(String[] args) {
		String test = "$$ welcome to 2nd class of automation";
		int letter=0, space=0, num=0, specialchar=0;
		char[] charArray = test.toCharArray();
		for( int i=0;i<charArray.length;i++) {
		System.out.println("charArray["+i+"]" +charArray [i]);
		}
		for( int i=0;i<test.length();i++) { 
			if(Character.isLetter(charArray[i])) { 
				letter++;}
			if(Character.isDigit(charArray[i])) {
				num++;}
			if(Character.isSpaceChar(charArray[i])) {
				space++; } 
			else { 
				specialchar++;
			}
				}
		System.out.println("letter:" +letter);
		System.out.println("space:" +space);
		System.out.println("number:" +num);
		System.out.println("specialcharacter:" +specialchar);
		
		
		

	}

}
 
