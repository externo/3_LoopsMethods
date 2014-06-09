import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class _08_SumNumbersFromFile {

	public static void main(String[] args) throws IOException {
        String string;
        double sum = 0;
        
        //change the path to the file and the name of it to fit yours
        String file ="D:\\JavaEclipse\\3_LoopsMethods\\src\\Input.txt";
        
	    try{
            InputStream ips = new FileInputStream(file); 
            InputStreamReader ipsr = new InputStreamReader(ips);
            BufferedReader br = new BufferedReader(ipsr);
            String line;
            while ( (line=br.readLine()) != null){
                string = line;
	            sum += Double.parseDouble(string);
            }
            br.close(); 			
	        System.out.print(sum);
        }       
        catch (Exception e){
            System.out.println("Error");
        }	    
	}
}
