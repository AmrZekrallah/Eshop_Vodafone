package org.example.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/main/resources/Vodafone_Scripts",
        glue = {"org.example.stepDefs"},
        plugin =  { "pretty", "html:target/cucumber.html"}
        ,
        tags="@smoke"

)

public class runners extends AbstractTestNGCucumberTests {
}