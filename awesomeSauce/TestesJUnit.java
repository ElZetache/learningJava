package awesomeSauce;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class TestesJUnit {

	@Test
	public void inputTieneQueSerMayorA0YMenosQue100() {
		assertFalse(GuessingGame.isInvalidInput(1));
		assertFalse(GuessingGame.isInvalidInput(100));
		assertFalse(GuessingGame.isInvalidInput(0));
		assertFalse(GuessingGame.isInvalidInput(37));
		assertTrue(GuessingGame.isInvalidInput(-1));
		assertTrue(GuessingGame.isInvalidInput(-.5));
		assertTrue(GuessingGame.isInvalidInput(101));
		assertTrue(GuessingGame.isInvalidInput(.75));		
	}
	@Test
	public void gameShouldContinueUntilGuessed() {
		assertTrue(GuessingGame.notGuessed(23, 26));
		assertTrue(GuessingGame.notGuessed(99, 100));
		assertTrue(GuessingGame.notGuessed(23, 24));
	}
	
	@After
	public void doAfter() {
		System.out.println("Runs after every test");
	}
	
	@Before
	public void doBefore() {
		System.out.println("Runs before every test");
	}
}
