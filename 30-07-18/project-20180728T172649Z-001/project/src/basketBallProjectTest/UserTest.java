package basketBallProjectTest;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;
import org.junit.Test;

import basketballProject.User;

public class UserTest {
	
	User newUser = new User("user1","password1");
	@Test
	public void TestsetName() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not matching", newUser.getfName(),"Tom");
	}
	@Test
	public void testAddable() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not addable",newUser.addable(), true);
	}
	@Test
	public void  testStoreDetails() {
		User userA = new User();
		userA.storeDetails(1, "sam", "Jackson", "password", "Sammy");
		
		assertEquals("not matching",userA.getfName(),"sam");
	}
	@Test
	public void testGetID() {
		assertEquals("not correct ID",newUser.getID(),1); //ID needs to be changed depending on when user is added
		
	}
	@Test
	public void testGetUserName() {
		assertEquals("not correct username", newUser.getUserName(),"user1");
	}
	@Test
	public void testGetfName() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not matching first name", newUser.getfName(),"Tom");
	}
	@Test
	public void getlname() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not matching last name", newUser.getlname(),"Jerry");
	}
	@Test
	public void getPass() {
		assertEquals("not matching password",newUser.getPass(),"password1");
	}
	@Test
	public void toJson() {
		newUser.setName("Tom", "Jerry");
		JSONObject obj = new JSONObject();
		obj = newUser.toJson();
		assertEquals("no match", newUser.toJson(), obj);
	}
	
}
