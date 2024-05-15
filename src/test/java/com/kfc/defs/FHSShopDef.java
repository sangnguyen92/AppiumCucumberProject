package com.kfc.defs;

import com.kfc.pages.FHSCartPage;
import com.kfc.pages.FHSShopHomepage;
import com.kfc.pages.FHSShopProductDetailPage;
import com.kfc.pages.FHSShopResultPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;


public class FHSShopDef {


    @Given("I am on the webshop home page")
    public void iAmOnTheWebshopHomePage() {


    }

    @When("I search with keyword {string}")
    public void iSearchWithKeyword(String keyword) {

        new FHSShopHomepage().enterKeyword(keyword);
    }

    @When("I select the first product")
    public void iSelectTheFirstProduct() {
        new FHSShopResultPage().access_item();

    }


    @When("I add this product into Cart")
    public void iAddThisProductIntoCart() {
        new FHSShopProductDetailPage().add_to_cart();

        
    }

    @And("I access the cart")
    public void iAccessTheCart() {
        new FHSCartPage().accessCart();

    }

    @Then("I should see the items and the corresponding quantity and correct total")
    public void iShouldSeeTheItemsAndTheCorrespondingQuantityAndCorrectTotal() {
        new FHSCartPage().selectItem();
        Assert.assertTrue("All information of this order is correct.",new  FHSCartPage().isTotalCorrect());

    }
}
