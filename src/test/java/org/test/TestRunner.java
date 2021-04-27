package org.test;

import java.io.File;

import org.base.JVMReporting;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)



@CucumberOptions(features = { "src\\test\\resources" }, glue = { "org.step" }, plugin = { "pretty",
		"json:src\\test\\resources\\Reports\\file.json"})

public class TestRunner {


}
