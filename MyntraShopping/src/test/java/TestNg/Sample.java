package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample 

{
	public class TestNgExample 
	{

		@BeforeClass ( )
		public void beforeclass()
		{
			System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void beforemethod()
		{
			System.out.println("Before Method");
			
		}
		
		@Test (priority = 4 ,invocationCount =2  )
		public void test1()
		{
			System.out.println("Test1");
		}
		
		@Test (priority = 1 , dependsOnMethods = ("test3"))
		public void test2()
		{
			System.out.println("Test2");
		}
		
		@Test (priority = 3  )
		public void test3()
		{
			System.out.println("Test3");
		//	Assert.fail();
		}
		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("after method");
		}	
		
		@AfterClass
		public void afterclass()
		{
			System.out.println("after class");
		}

		


	

}
}