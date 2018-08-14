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
	
	public void addable() {
		newUser.setName("Tom", "Jerry");
		assertEquals("not addable",newUser.addable(), true);
	}
	
	public void  storeDetails(int id,  String fname, String lname, String pass, String uname) {
		
	}
	
	public int getID() {
		
	}
	public String getUserName() {
		
	}
	public String getfName() {
		
	}
	public String getlname() {
		
	}
	public String getPass() {
		
	}
	public JSONObject toJson() {
		
	}
	
	
	
}
