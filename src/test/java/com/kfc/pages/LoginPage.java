package com.kfc.pages;


import com.appium.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	TestUtils utils = new TestUtils();

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
	private WebElement dennyBtn;


	@AndroidFindBy(xpath = "//android.view.View[@resource-id=\"header-main\"]/android.view.View/android.widget.ListView/android.view.View/android.view.View")
	private WebElement accountIcon;
	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"email\"]")
	private WebElement usernameTxtFld;

	@AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"password\"]")
	private WebElement passwordTxtFld;

	@AndroidFindBy (xpath = "//android.widget.Button[@text=\"Đăng nhập\"]")
	private WebElement loginBtn;

	@AndroidFindBy (xpath = "//android.widget.TextView[@text=\"Vui lòng nhập một địa chỉ email hợp lệ.\"]")
	private WebElement errTxt;

	@AndroidFindBy (xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
	private WebElement popupBtn;

	public LoginPage(){
	}

	public LoginPage accessPage(){
		click(dennyBtn);
		click(popupBtn);
//		if (isVisibility(popupBtn) == true){
//			click(popupBtn);
//		}
		click(accountIcon);
		return this;
	}
public LoginPage enterUserName(String username) throws InterruptedException {
	clear(usernameTxtFld);	
	sendKeys(usernameTxtFld, username, "login with " + username);
	return this;
}

public LoginPage enterPassword(String password) {
	clear(passwordTxtFld);
	sendKeys(passwordTxtFld, password, "password is " + password);
	return this;
}

public LoginPage pressLoginBtn() {
	click(loginBtn, "press login button");
	return this;
}

public LoginPage login(String username, String password) throws InterruptedException {
	enterUserName(username);
	enterPassword(password);
	return pressLoginBtn();
}

public String getErrTxt() {
	String err = getText(errTxt, "error text is - ");
	return err;
}


}
