package com.softwareinstitute.training.murray.ben;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features="src/test/resources/LibraryOOPMaven")
public class RunCucumberTest{
}
