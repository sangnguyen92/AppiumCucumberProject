package com.kfc.defs;


import com.appium.utils.DriverManager;
import com.appium.utils.VideoManager;
import com.kfc.pages.BasePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;

import java.io.IOException;

public class Hooks1 {

    @Before("@fhs")
    public void initialize() throws Exception {
        BasePage basePage = new BasePage();
   //     basePage.closeApp();
        basePage.accessPage("https://fahasa.com");
        new VideoManager().startRecording();
    }

    @After("@fhs")
    public void quit(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            byte[] screenshot = new DriverManager().getDriver().getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        new VideoManager().stopRecording(scenario.getName());

    }
}
