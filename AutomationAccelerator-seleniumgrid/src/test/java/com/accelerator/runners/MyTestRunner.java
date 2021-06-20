package com.accelerator.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"com.accelerator.stepdefinitions", "com.accelerator.hooks"},
      plugin = {"pretty","html:test-output_1",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/",
                "json:target/cucumber.json"},
       	monochrome= true,
        dryRun= false
)

public class MyTestRunner {

}