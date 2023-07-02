package testNG;

import org.testng.annotations.Test;

public class Parallel_Execution2 {
	@Test
	
	public void testMethod4() {
		System.out.println("TestClass2>>testMethod4 "+Thread.currentThread().getId());
	}
	
	@Test
	
	public void testMethod5() {
		System.out.println("TestClass2>>testMethod5 "+Thread.currentThread().getId());
	}
	@Test

	public void testMethod6() {
	System.out.println("TestClass2>>testMethod6 "+Thread.currentThread().getId());
}


}
