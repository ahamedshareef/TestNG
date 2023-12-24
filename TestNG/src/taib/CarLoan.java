package taib;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {
	
	@BeforeSuite
	public void setEnvironment() {
		System.out.println("Setting before Suite Environment..");
	}
	
	@BeforeSuite
	public void setEnvironment2() {
		System.out.println("<2>Setting before Suite Environment..");
	}
	
	@BeforeMethod
	public void beforeEach() {
		System.out.println("Accept Cookies");
	}
	@AfterMethod
	public void afterEach() {
		System.out.println("Delete Cookies");
	}
	
	@Test
	public void WebloginCarLoan() {
		System.out.println("WebloginCarLoan");
		
	}
	
	@Test
	public void MobileLoginCarLoan() {
		System.out.println("Mobile Login");
	}
	
	@Test
	public void LoginAPIcarLoan() {
		System.out.println("API Login");
	}

}
