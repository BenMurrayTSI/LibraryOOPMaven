package com.softwareinstitute.training.murray.ben;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features="src/test/resources/LibraryOOPMaven")
public class RunCucumberTest{
}
