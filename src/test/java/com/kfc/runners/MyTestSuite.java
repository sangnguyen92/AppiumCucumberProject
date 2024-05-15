// package com.kfc.runners;


// import com.appium.utils.DriverManager;
// import com.appium.utils.GlobalParams;
// import com.appium.utils.ServerManager;
// import io.cucumber.junit.Cucumber;
// import io.cucumber.junit.CucumberOptions;
// import org.apache.logging.log4j.ThreadContext;
// import org.junit.AfterClass;
// import org.junit.BeforeClass;

// import org.junit.platform.suite.api.*;
// import org.junit.platform.suite.api.Suite;
// import org.junit.runner.RunWith;

// import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;
// import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

// @RunWith(Cucumber.class)
// @CucumberOptions(
//         plugin = {"pretty"
//                 , "html:target/cucumber/report.html"
//                 , "summary"
// //                , "me.jvt.cucumber.report.PrettyReports:target/Pixel3/cucumber-html-reports"
//         }
//         ,features = {"src/test/resources/features/KFC_Login.feature"}
//         ,glue = {"com.kfc.defs"}
//         ,snippets = CAMELCASE
//         ,dryRun=false
//         ,monochrome=true
// //        ,tags = "@test"

// )

// public class MyTestSuite {

//     @BeforeClass
//     public static void initialize() throws Exception {
//         GlobalParams params = new GlobalParams();
//         params.initializeGlobalParams();

//         ThreadContext.put("ROUTINGKEY", params.getPlatformName() + "_"
//                 + params.getDeviceName());

//         new ServerManager().startServer();
//         new DriverManager().initializeDriver();

//     }

//     @AfterClass
//     public static void quit(){
//         DriverManager driverManager = new DriverManager();
//         if(driverManager.getDriver() != null){
//             driverManager.getDriver().quit();
//             driverManager.setDriver(null);
//         }
//         ServerManager serverManager = new ServerManager();
//         if(serverManager.getServer() != null){
//             serverManager.getServer().stop();
//         }
//     }
// }
