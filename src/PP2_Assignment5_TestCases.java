import static org.junit.Assert.*;
import org.junit.Test;

public class PP2_Assignment5_TestCases {

	//Test 1 expecting 1 with 2 and 3, should pass
	@Test
	public void test1() {
		gcdCalculator gcdCalc = new gcdCalculator();
		assertEquals(1, gcdCalc.findGCD(2,3));
	}
	
	//Test 2 expecting 2 with 2 and 10, should pass
	@Test
	public void test2() {
		gcdCalculator gcdCalc = new gcdCalculator();
		assertEquals(2, gcdCalc.findGCD(2,10));
	}
		
	//Test 3 expecting 5 with 25 and 35, should pass
	@Test
	public void test3() {
		gcdCalculator gcdCalc = new gcdCalculator();
		assertEquals(5, gcdCalc.findGCD(25,35));
	}
	//Test 4 expecting 5 with 205 and 301, should fail
	@Test
	public void test4() {
		gcdCalculator gcdCalc = new gcdCalculator();
		assertEquals(5, gcdCalc.findGCD(205,301));
	}
	//Test 5 expecting 5 with 205 and 300, should pass
	@Test
	public void test5() {
		gcdCalculator gcdCalc = new gcdCalculator();
		assertEquals(5, gcdCalc.findGCD(205,300));
	}

}
