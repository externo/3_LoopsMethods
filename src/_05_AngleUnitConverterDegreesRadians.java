import java.util.Scanner;


public class _05_AngleUnitConverterDegreesRadians {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		String[] collection = new String[n];
		for (int i=0; i<n; i++){
			String inputString = input.nextLine();
			collection[i] = inputString;
		}
		input.close();
		for (int i=0; i<n; i++){
			String element = collection[i];
			int l = element.length();
			if (element.substring(l-3, l).equals("deg")){
				System.out.println(radians(element));	
				
			}else if (element.substring(l-3, l).equals("rad")){
				System.out.println(degrees(element));	
			}
		}
	}
	
	public static String radians(String degrees){
		return Integer.parseInt(degrees.substring(0, degrees.length()-4))*Math.PI/180+" rad";
	}
	public static String degrees(String radians){
		return Integer.parseInt(radians.substring(0, radians.length()-4))*180/Math.PI+" deg";
	}
}
