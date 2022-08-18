package org.run;

import java.io.IOException;

import org.base.BaseClass;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Runner extends BaseClass {

	@BeforeClass

	private void browserLaunch() {

		launchBrowser();
		maxBrowser();

	}

	@AfterClass

	private void browserClose() {

		closebrowser();

	}

	@BeforeMethod

	public void startsTime() throws InterruptedException {

		passUrl("https://portal-dev.rsgt.com:8090/");

	//	Thread.sleep(7000);

	}

	@AfterMethod

	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}
//	@Test
//	private void tc1() throws InterruptedException, IOException {
//		
//		String [] txtuser= {excelRead(1, 1),excelRead(1, 2),excelRead(1, 1)};
//		String[] txtpass= {excelRead(0, 2),excelRead(2, 1)};
//		
//		for (int i = 0; i < txtuser.length -1 ; i++) {
//			
//			System.out.println("length of username "+txtuser.length);
//			System.out.println("length of the password"+txtpass.length);
//			
//
//				
//			
//			 
//		}

//}

	@Test
	private void tc1() throws InterruptedException {

		LoginPojo l = new LoginPojo();

		btnClick(l.getPressbtn());

		toInput(l.getEditBox(), "sureshsgsjsjnds");

		toInput(l.getAnsBox(), "gshshjsjs");

		btnClick(l.getLognbtn());
		
		printText(l.getErrorpage());
		
		Thread.sleep(5000);
		
		
		driver.navigate().back();
		
		

	}
	@Test
	private void tc2() {
		
		LoginPojo l1=new LoginPojo();
		
		btnClick(l1.getPressbtn());
		
		toInput(l1.getEditBox(), "cieloconsignee@gmail.com");
		
		toInput(l1.getAnsBox(), "123");
		
		btnClick(l1.getLognbtn());
		
		

	}

}
