package com.Ecommerce.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Ecommerce.GenericUtility.BaseTest;
import com.Ecommerce.objectRepository.SignInPage;
import com.Ecommerce.objectRepository.WelcomePage;

public class LoginTest extends BaseTest {

	@Test
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String email = e.readDataFromExcel(EXCELPATH, LOGINSHEET, 1 ,0);
		String password = e.readDataFromExcel(EXCELPATH, LOGINSHEET, 1 ,1);
		
		//click on login link
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		//perform login operation
		SignInPage sip = new SignInPage(driver);
		sip.toLoginIntoDemo(email, password);
		
		Thread.sleep(3000);
	}

}
