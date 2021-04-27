package org.adact;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Fail implements IRetryAnalyzer {

	int min = 0, max = 3;

	@Override
	public boolean retry(ITestResult arg0) {
		if (min < max) {

			min++;
			return true;

		}
		return false;
	}

}
