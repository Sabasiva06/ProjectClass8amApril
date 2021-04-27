package org.adact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class Failed implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation anno, Class arg1, Constructor arg2, Method arg3) {
		IRetryAnalyzer retryAnalyzer = anno.getRetryAnalyzer();

		if (retryAnalyzer == null) {
			anno.setRetryAnalyzer(Fail.class);
		}

	}

}
