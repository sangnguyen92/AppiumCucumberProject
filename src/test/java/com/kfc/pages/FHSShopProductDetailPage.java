package com.kfc.pages;




public class FHSShopProductDetailPage extends BasePage{
    public static final String ADD_TO_CART_BUTTON = "/html/body/section/section/div/div[2]/div/div[1]/div[2]/div/div/form/div/div[1]/div[2]/div[15]/div/ul/li[2]/button";
    public FHSShopProductDetailPage(){

    }

    public void add_to_cart() {
        click(ADD_TO_CART_BUTTON);

    }
}
