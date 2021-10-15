package week1day2;

public class ReverseTheEvenwords {

	public static void main(String[] args) {
		String test = "i am a software tester";
		String finalTest = " ";
		int lengthTest = test.length();
		String[] data = test.split(" ");
		int lengthTest1 = data.length;
		for (int i = 0; i < lengthTest1; i++) {
			if (i % 2 != 0) {
				char[] charArray = data[i].toCharArray();
				String strrev = "";
				for (int j = charArray.length - 1; j >= 0; j--) {
					strrev = strrev + data[i].charAt(j);
				}
				data[i] = strrev;

				System.out.println("i" + strrev + "a" + strrev + "tester");

			}
		}
		for (int k = 0; k < lengthTest1; k++) {
			finalTest = finalTest + " " + data[k];
		}
		System.out.println(finalTest);
	}

}
