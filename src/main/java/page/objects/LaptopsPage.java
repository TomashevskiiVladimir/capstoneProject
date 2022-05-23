package page.objects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsPage extends Base{
	public LaptopsPage() {
		PageFactory.initElements(driver, this);
		
	}

}
