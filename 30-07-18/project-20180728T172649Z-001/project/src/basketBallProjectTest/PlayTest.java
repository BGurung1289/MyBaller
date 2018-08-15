package basketBallProjectTest;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import basketballProject.Play;

public class PlayTest {
	
	Play testPlay = new Play("Pick and Roll");
	
	@Test
	public void testGetID(){
		assertEquals("not match", testPlay.getID(), 1);
	}
	
	@Test
	public void testGetPlayName(){
		assertEquals("not match", testPlay.getPlayName(), "Pick and Roll");
	}
	
	@Test
	public void TesttoJson() {
		JSONObject obj = new JSONObject();
		obj = testPlay.toJson();
		assertEquals("not match", testPlay.toJson(), obj);
	}
	
	
}
