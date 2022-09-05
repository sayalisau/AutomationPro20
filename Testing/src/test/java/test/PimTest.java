package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PimTest extends BaseTest{

	@BeforeClass
	public void login() {
		loginPage.loginMethod();
	}
	
	@Test(priority=3)
	public void verifyPimPage() {
			AssertJUnit.assertEquals(pimPage.titleOfPimPage(), "PIM");
	}
	
	@Test(priority=4)
	public void verifyIdCheckBoxIsSelected() {
		pimPage.selectIdcheckBox();
		AssertJUnit.assertEquals(pimPage.verifyIdCheckBoxSelected(), true);
	
}
}
