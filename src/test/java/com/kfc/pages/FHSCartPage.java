package com.kfc.pages;

public class FHSCartPage extends BasePage{

    static final String CART_URL= "//*[@id=\"cart\"]/a/div/div";
    static final String CHECK_BOX="/html/body/section/section/div/div[2]/div/div/div[2]/div/div[1]/div[5]/div/div/div[4]/form/div/div[1]/div/div[2]/div[1]/div[1]/input";

    static final String quantity_of_item="/html/body/section/section/div/div[2]/div/div/div[2]/div/div[1]/div[5]/div/div/div[4]/form/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/input";
    static final String price_of_item="/html/body/section/section/div/div[2]/div/div/div[2]/div/div[1]/div[5]/div/div/div[4]/form/div/div[1]/div/div[2]/div[1]/div[3]/div[1]/div[2]/div/div/div[1]/span";
    static final String total_of_order="/html/body/section/section/div/div[2]/div/div/div[2]/div/div[1]/div[5]/div/div/div[5]/div/div[1]/div[2]";

    public FHSCartPage(){

    }

    public void accessCart(){
        click(CART_URL);
    }

    public void selectItem(){
        scrollGesture(total_of_order);
        click(CHECK_BOX);
    }

    public boolean isTotalCorrect() {
        int quty = get_quantity_of_item(quantity_of_item);

        int price = get_price_of_item(price_of_item);

        int total = quty*price;

        int total_in_cart = get_total_of_order(total_of_order);

        if (total_in_cart==total){
            return true;
        }else return false;
    }
}
