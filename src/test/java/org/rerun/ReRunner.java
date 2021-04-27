package org.rerun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = { "@target\\rerun.txt" }, glue = { "org.step" }, plugin = { "pretty",
		"json:src\\test\\resources\\Reports\\file.json", "rerun:target\\failed.txt" })

public class ReRunner {

}
