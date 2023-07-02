package testNG;
/*2 types of execution
 * 1. sequential execution: normal prgm execution- side by side execution
 * 2. parallel execution: At a time specified no of methods will be executed
 * keyword: parallel, thread count
 */

import org.testng.annotations.Test;
/* none-- no parallel execution
 * thread can be given as minus, but it will give exception==illegalArgumentException
 * thread count=1 -- sequential execution
 * Assignment:
 * class 1- googleTest--selenium--enter
 * class 2- Obsqura first site
 * class 3- obsqura 2nd site
 */
public class Parallel_Execution1 {
	
	@Test
	
	public void testMethod1() {
		System.out.println("TestClass1>>testMethod1 "+Thread.currentThread().getId());
	}
	
	@Test
	
	public void testMethod2() {
		System.out.println("TestClass1>>testMethod2 "+Thread.currentThread().getId());
	}
	@Test

	public void testMethod3() {
	System.out.println("TestClass1>>testMethod3 "+Thread.currentThread().getId());
}



}
