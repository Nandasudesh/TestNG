package testNG;

import org.testng.annotations.Test;

public class Parallel_Execution3 {
	@Test
	
	public void testMethod7() {
		System.out.println("TestClass3>>testMethod7 "+Thread.currentThread().getId());
	}
	
	@Test
	
	public void testMethod8() {
		System.out.println("TestClass3>>testMethod8 "+Thread.currentThread().getId());
	}
	@Test

	public void testMethod9() {
	System.out.println("TestClass3>>testMethod9 "+Thread.currentThread().getId());
}


}
