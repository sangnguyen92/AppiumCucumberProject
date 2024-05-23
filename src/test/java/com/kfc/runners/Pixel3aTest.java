package com.kfc.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
         plugin = { "pretty", "html:target_TestNG/Pixel_3a/cucumber-report.html", "summary"
        },
        features = {"src/test/resources/features/KFC_Login.feature"}
        ,glue = {"com.kfc.defs"}
        ,dryRun=false
        ,monochrome=true
)
public class Pixel3aTest extends RunnerBase{



}
