public class Huiswerk1 {
	
	private static String id = "";
	private static int numA = 0;
	private static int numB = 0;
	private static int numC = 0;
	private static boolean answer = false;
	
	public static void main(String[] args) {
		id = "9509125270083";
		validationID();
	}
	
	public static void validationID(){
		sectionA();
		sectionB();
		sectionC();
		
		if (numC == Integer.parseInt(""+(id.charAt(12))))
			answer = true;
		if (answer)
			System.out.println("ID Number: " + id + " is VALID.");
		else
			System.out.println("ID Number: " + id + " is NOT Valid.");
	}
	
	public static void sectionA(){
		String num = "";
		for (int i = 0; i < 11; i+=2)
			num += id.charAt(i);
		for (int i  = 0; i < num.length(); i++)
			numA += Integer.parseInt(Character.toString(num.charAt(i)));	
	}
	
	public static void sectionB(){
		String num = "";
		int number = 0;
		for (int i = 1; i < 12; i += 2)
			num += id.charAt(i);
		number = Integer.parseInt(num)*2;
		num = Integer.toString(number);
		for (int i = 0; i < num.length(); i++)
			numB += Integer.parseInt(Character.toString(num.charAt(i)));
	}
	
	public static void sectionC(){
		int number = numA+numB;
		String num = Integer.toString(number);
		int count = Integer.toString(number).length();
		switch(count){
		case 1:
			numC = 10 - number;
			break;
		case 2:
			numC = 10 - Integer.parseInt(""+(num.charAt(1)));
			break;
		case 3:
			numC = 10 - Integer.parseInt(""+(num.charAt(2)));
			break;
		}
		
	}


}
