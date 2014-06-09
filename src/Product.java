public class Product{
	private String inputString;
	public String input, name, price;

	public Product(String input) {
		// TODO Auto-generated constructor stub
		inputString = input;
	}	
	
	public String output(){
		String[] splited = inputString.split(" ");
		name = splited[0];
		price = splited[1];
		return price+" "+name;
	}
}
