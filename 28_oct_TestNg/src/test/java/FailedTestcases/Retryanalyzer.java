package FailedTestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retryanalyzer implements IRetryAnalyzer{

	
	int count  = 0 ;  //failed
	
	int Retrylimit = 10 ;
	
	public boolean retry(ITestResult result) {

		if(count<Retrylimit) {
			count++;
			return false;
		}
		return false;
	}

}
