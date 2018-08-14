package basketBallProjectTest;

import static org.junit.Assert.assertEquals;

import org.json.JSONObject;

import basketballProject.User;

public class UserTest {
	
	User newUser = new User("user1","password1");
	public void TestsetName() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not matching", newUser.getfName(),"Tom");
	}
	
	public void testAddable() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not addable",newUser.addable(), true);
	}
	
	public void  testStoreDetails() {
		User userA = new User();
		userA.storeDetails(1, "sam", "Jackson", "password", "Sammy");
		
		assertEquals("not matching",userA.getfName(),"sam");
	}
	
	public void testGetID() {
		assertEquals("not correct ID",newUser.getID(),1); //ID needs to be changed depending on when user is added
		
	}
	public void testGetUserName() {
		assertEquals("not correct username", newUser.getUserName(),"user1");
	}
	public void testGetfName() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not matching first name", newUser.getfName(),"Tom");
	}
	public void getlname() {
		
	}
	public void getPass() {
		
	}
	public void toJson() {
		
	}
	
	
	
}
