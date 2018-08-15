package basketBallProjectTest;

import static org.junit.Assert.*;

import org.junit.Test;

import basketballProject.Address;

public class AddressTest {

	Address testAddress = new Address("HP14 4UT","kilnwood","highwycombe","United Kingdom");
	
	@Test
	public void testGetStreet(){
		assertEquals("not match", testAddress.getStreet(), "kilnwood");
	}
	@Test
	public void testGetCity(){
		assertEquals("not match", testAddress.getCity(), "highwycombe");
	}
	@Test
	public void testGetCountry(){
		assertEquals("not match", testAddress.getCountry(), "United Kingdom");
	}
	
	@Test
	public void testGetPostcode() {
		assertEquals("no match", testAddress.getPostcode(), "HP14 4UT");
	}
	
}
