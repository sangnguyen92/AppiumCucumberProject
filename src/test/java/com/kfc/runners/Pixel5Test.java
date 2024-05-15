package com.kfc.runners;


import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features/FHSShop.feature"}
        ,glue = {"com.kfc.defs"}
        ,dryRun=false
        ,monochrome=true
)
public class Pixel5Test extends RunnerBase1{



}
