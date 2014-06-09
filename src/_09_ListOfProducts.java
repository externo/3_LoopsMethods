import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;



public class _09_ListOfProducts {

	public static void main(String[] args) throws URISyntaxException, IOException {
		
		//prepare to read
		URL inputPath = ClassLoader.getSystemResource("InputProducts.txt");
		if(inputPath==null) {
			System.out.println("The file was not found!");
		}		
		File inputFile = new File(inputPath.toURI());
		BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				
        ArrayList<String> inputs = new ArrayList<String>();
        String line;
	    
//	    //prepare to write
	    URL outPath = ClassLoader.getSystemResource("OutputProducts.txt");
		File outFile = new File(outPath.toURI());
//		if(!outFile.exists()) {
//			System.out.println("The file was not found!");
//		}
//		FileWriter out = new FileWriter(outFile.getAbsoluteFile());
//		BufferedWriter writer = new BufferedWriter(out);

        //read the file
        while ( (line=reader.readLine()) != null){
        	Product product = new Product(line);
        	inputs.add(product.output());
        }
        reader.close();         
        
	    Collections.sort(inputs);
		
	  //write sorted products in file
	    Writer writer = null;
	    try {
	        writer = new BufferedWriter(new OutputStreamWriter(
	              new FileOutputStream("D:\\JavaEclipse\\3_LoopsMethods\\src\\OutputProducts.txt"), "utf-8"));
	        
	        for (String l: inputs){
	        	writer.write(l);	
	        	((BufferedWriter) writer).newLine();
	        }
	    } catch (IOException ex) {
	    } finally {
	       try {writer.close();} catch (Exception ex) {}
	    }
	}
}
