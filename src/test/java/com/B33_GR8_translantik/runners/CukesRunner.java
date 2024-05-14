package com.B33_GR8_translantik.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features",
        glue = "com/B33_GR8_translantik/step_definitions",
        dryRun = false,
        tags = "@B33G8-145",
        publish = true //generating a report with public link
)
public class CukesRunner {}
