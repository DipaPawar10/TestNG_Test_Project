package Demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerClass implements ITestListener {
	
			
    public void onStart(ITestContext Result) {					
		System.out.println("On start mehod invoked.");
    }
	
			
    public void onFinish(ITestContext Result) {					
		System.out.println("On finished method invoked");
    }	
    
    public void onTestStart(ITestResult Result) {					
    	System.out.println("Name of the test method Started:" + Result.getName());        		

    }		

    public void onTestFailure(ITestResult Result) {					
    	System.out.println("Name of the Test Method failed:"+ Result.getName());
    }		

    		
    public void onTestSkipped(ITestResult Result) {					
	System.out.println("Name of the test method skiped:" + Result.getName());        		
    }		
    
    public void onTestSuccess(ITestResult Result) {					
    	System.out.println("Name of the test method Successfully executed:" + Result.getName());        		
        		
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        		
    }

}
