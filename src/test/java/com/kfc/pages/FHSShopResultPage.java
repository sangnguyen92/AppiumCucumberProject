package com.kfc.pages;




public class FHSShopResultPage extends BasePage {

    String ITEM = "/html/body/section/section/div/div[2]/div[1]/div/div[2]/div/div/div[5]/div/div/div[2]/div/div/div[3]/ul/li[1]";
    public FHSShopResultPage(){

    }

    public void access_item() {
        click(ITEM);

    }

}
