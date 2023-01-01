package utility;

import java.io.IOException;
import java.util.Random;

import org.testng.ITestListener;
import org.testng.ITestResult;

import tests.BaseTest;

public class listenerimpl extends BaseTest implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
	
		
		Random no=new Random();              
		String testName= result.getName()+"--"+Screenshot.getCurrentDate();         //+no.nextInt()
		
		try {
			Screenshot.captureScreen(driver,testName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
