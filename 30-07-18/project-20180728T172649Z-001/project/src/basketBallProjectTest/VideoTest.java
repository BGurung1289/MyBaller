package basketBallProjectTest;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import basketballProject.Video;

public class VideoTest {
	
	private Video testV = new Video("Shooting Form", "www.youtube.com/bballshooting");
	
	@Test
	public void testGetID() {
		assertEquals("not matched",testV.getID(),1);
	}
	
	public void testGetVideoTitle() {
		assertEquals("not matching",testV.getVideoTitle(),"Shooting Form");
	}
	
	public void testGetVideoURL() {
		assertEquals("not matching", testV.videoURL(),"www.youtube.com/bballshooting");
	}
	
	
	public void testtoJson() {
		JSONObject obj = new JSONObject();
		obj = testV.toJson();
		assertEquals("no match", testV.toJson(),obj);
	}
}
