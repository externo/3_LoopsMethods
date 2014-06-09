import java.text.SimpleDateFormat;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String date1 = input.nextLine();
		String date2 = input.nextLine();
		input.close();

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
 
		try {
			long diff = format.parse(date2).getTime() - format.parse(date1).getTime();
 
			long diffDays = diff / (24 * 60 * 60 * 1000);
 
			System.out.print(diffDays + " days");
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
