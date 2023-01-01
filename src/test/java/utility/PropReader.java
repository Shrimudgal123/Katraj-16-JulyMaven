package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class PropReader {
	public static String readProperties(String Key1) throws FileNotFoundException{
		
		
		String path=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
		
		Properties prop=new Properties();
		
		FileInputStream fis=new FileInputStream(path);
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String val="";
		 val=prop.getProperty(Key1);
		 
		return val;
	}
  /*   public static void main(String[] args) throws FileNotFoundException {
	
    	 PropReader pr=new PropReader();

         pr.readProperties("URL");
         System.out.println(readProperties("URL"));
}*/
}
