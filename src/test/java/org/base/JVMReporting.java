package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReporting {

	public static void generateJvmReprot(String jsonfile) {

		File file = new File(
				"C:\\Users\\WELCOME\\eclipse-workspace\\Greens\\SampleMaven\\src\\test\\resources\\Reports");
		Configuration configuration = new Configuration(file, "Facebook");
		configuration.addClassifications("Sprint No", "2");
		configuration.addClassifications("Browser", "chrome");
		configuration.addClassifications("version", "88");
		configuration.addClassifications("OS", "win-10");
		configuration.addClassifications("Environment", "UI");

		List<String> li = new ArrayList<String>();
		li.add(jsonfile);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
