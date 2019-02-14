package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class CustomRetryAnalyzer implements IRetryAnalyzer{
	
	/**
	   * Returns true if the test method has to be retried, false otherwise.
	   *
	   * @param result The result of the test method that just ran.
	   * @return true if the test method has to be retried, false otherwise.
	   */
	
	/*
	 * (non-Javadoc)
	 * @see org.testng.IRetryAnalyzer#retry(org.testng.ITestResult)
	 * 
	 * This method decides how many times a test needs to be rerun.
	 * TestNg will call this method every time a test fails. So we 
	 * can put some code in here to decide when to rerun the test.
	 * 
	 * Note: This method will return true if a tests needs to be retried
	 * and false it not.
	 *
	 */

	int counter=0;
	int count=3;
	
	public boolean retry(ITestResult result) {
		
		if(counter<count)
		{
			counter++;
			return true;
		}
		
		return false;
	}

}
