package basketBallProjectTest;

import static org.junit.Assert.*;

import org.junit.Test;

import basketballProject.BasketballCourt;

public class BasketballCourtTest {
	
	BasketballCourt testCourt = new BasketballCourt("Kilnwood","High Wycombe","United Kingdom", "HP14 4UT");
	
	@Test
	public void testGetPostcode(){
		assertEquals("not same", testCourt.getPostcode(), "HP14 4UT");
	}
	@Test
	public void testGetCourtID(){
		assertEquals("not same", testCourt.getCourtID(), 1101);
	}
	
}
