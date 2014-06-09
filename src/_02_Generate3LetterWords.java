import java.util.Scanner;


public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inputString = input.next();
		input.close();
		for (int i = 0; i< inputString.length(); i++){
			for (int j = 0; j< inputString.length(); j++){
				for (int k = 0; k< inputString.length(); k++){
					System.out.println(""+inputString.charAt(i)+inputString.charAt(j)+inputString.charAt(k));
				}
			}
		}
	}

}
