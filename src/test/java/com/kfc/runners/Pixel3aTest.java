package com.kfc.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/KFC_Login.feature"}
        ,glue = {"com.kfc.defs"}
        ,dryRun=false
        ,monochrome=true
)
public class Pixel3aTest extends RunnerBase{



}
