package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void captureScreen(WebDriver driver, String name) throws IOException {
		
		//Step1 upcast
		
		TakesScreenshot tss=(TakesScreenshot) driver;
		
		//Step 2capture Screen
		
		File sourceFile=tss.getScreenshotAs(OutputType.FILE);
		
		
		//step-3 
		String path=System.getProperty("user.dir")+"\\screenshots\\" +name+ ".png";
						
		File destinationFile=new File(path);
		
	    //step-4 store file in desired location
		
		FileHandler.copy(sourceFile, destinationFile);
		
		System.out.println("successfully captured screenshot");
	
			}
   public static String getCurrentDate() {
	   
	   DateFormat pat=new SimpleDateFormat("yyyy-MM-dd");
	   
	   Calendar cal=Calendar.getInstance();
	   
	   String currentDate=  pat.format(cal.getTime());
	  
		 return currentDate;
   }
   
   public static void main(String[] args) {
	   System.out.println(getCurrentDate());
}
}
