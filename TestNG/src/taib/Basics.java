package taib;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * }
	 */
	@BeforeClass
	public void beforeClassExecute() {
		System.out.println("Special Class Started  ..");
	}
	
	@AfterClass
	public void afterClassExecute() {
		System.out.println("Special Class Ended ..");
	}
	
	@BeforeTest
	public void preloadData() {
		System.out.println("Data Loading for test Class Basic @BeforeTest..");
	}
	@Test
	public void demo1() {
		System.out.println("Test1");
	}
	
	@Test
	public void ademo2() {
		System.out.println("Test2");
	}
	@Test(groups={"Smoke"})
	public void demo3() {
		System.out.println("Test3");
	}

	@AfterTest
	public void unloadData() {
		System.out.println("Data Unload for test Class Basic ..");
	}
	
	@AfterSuite
	public void delEnvironment() {
		System.out.println("Resetting after Suite Environment..");
	}
}
