package com.B33_GR8_translantik.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",
        glue = "com/B33_GR8_translantik/step_definitions"
)
public class FailedTestRunner {
}


