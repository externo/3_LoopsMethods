import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.HashMap;



public class _10_OrderProducts {

	public static void main(String[] args) throws URISyntaxException, IOException {
		
		//prepare to read Products 
		URL inputPath = ClassLoader.getSystemResource("InputProducts.txt");
		File inputFile = new File(inputPath.toURI());
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				
		HashMap<String,String> inputs = new HashMap<String,String>();
        String line;
        //read the file Products
        while ( (line=reader.readLine()) != null){
        	Product product = new Product(line);
        	product.output();
        	//System.out.println(product.name+" "+ product.price);
        	inputs.put(product.name, product.price);
        }
        reader.close();         
        
		double sum = 0;		

        //read the ORDER
		String path = "D:\\JavaEclipse\\3_LoopsMethods\\src\\Order.txt";
		FileInputStream fis = new FileInputStream(path);
		BufferedReader order = new BufferedReader(new InputStreamReader(fis));
		
        //read the file ORDER
		String l;
        while ( (l=order.readLine()) != null){
        	String[] splited = l.split(" ");
        	for (String key: inputs.keySet()){
        		if (key.equals(splited[1])){
        			sum += Double.parseDouble(inputs.get(key))*Double.parseDouble(splited[0]);
        		}
        	}
        }
        order.close(); 
		
		String sumString =""+sum;
		
	  //write sorted products in file
	    Writer writer = null;
	    try {
	        writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("D:\\JavaEclipse\\3_LoopsMethods\\src\\OutputOrder.txt"), "utf-8"));

    	writer.write(sumString);	
    	((BufferedWriter) writer).newLine();
	    } catch (IOException ex) {
	    } finally {
	       try {writer.close();} catch (Exception ex) {}
	    }
	}
}
