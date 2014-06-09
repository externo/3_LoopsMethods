import java.util.Scanner;


public class _01_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		int number1 = inputScanner.nextInt();
		int number2 = inputScanner.nextInt();
		inputScanner.close();
		for (int number=number1; number<=number2; number++){
			String numberString = ""+number;
			String reverse = "";
			
			for (int i = numberString.length()-1; i>=0; i--){
				reverse += numberString.charAt(i);
			}

			if (numberString.equals(reverse)){
				System.out.println(numberString);
			}
		}
	}

}
