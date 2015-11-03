/**
 * 
 */
package test;

import org.junit.Test;

import collegeboard.NumberGuessingGame;
import junit.framework.TestCase;

/**
 * @author jsonis
 *
 */
public class NumberGuessingGameTest extends TestCase {

	/**
	 * @param name
	 */
	public NumberGuessingGameTest(String name) {
		super(name);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link collegeboard.NumberGuessingGame#genRandomNumbers()}.
	 */
	public void testGenRandomNumbers() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link collegeboard.NumberGuessingGame#genNumbers(int, int, java.lang.String)}.
	 */
	@Test
	public void testGenNumbersLower() {
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		int number = numberGuessingGame.genNumbers(50,20,"lower");
		assertEquals(35,number);
	}
	
	@Test
	public void testGenNumbersHigher() {
		NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
		int number = numberGuessingGame.genNumbers(50,20,"higher");
		assertEquals(35,number);
	}

}
