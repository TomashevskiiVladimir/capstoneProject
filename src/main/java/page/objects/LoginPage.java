package page.objects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPage extends Base {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

}
