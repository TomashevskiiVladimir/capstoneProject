package page.objects;

import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DesktopsPage extends Base {
	public DesktopsPage() {
		PageFactory.initElements(driver, this);
		
	}

}
