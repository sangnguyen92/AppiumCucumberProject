package com.kfc.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FHSShopHomepage extends BasePage{


    String searchBox = "/html/body/section/section/div/div[2]/section/div[2]/div[2]/div[2]/div[1]/div/form/div/div/input";
    public FHSShopHomepage(){

    }
//    public void accessPage(){
//        accessPage("http://telsa.com");
//
//    }
    public FHSShopHomepage enterKeyword(String keyword){
        click(searchBox);
        sendKeys(searchBox,keyword);
        sendKeysEnter(searchBox);


//        clear(usernameTxtFld);
//        sendKeys(usernameTxtFld, keyword, "login with " + keyword);
        return this;
    }
}
