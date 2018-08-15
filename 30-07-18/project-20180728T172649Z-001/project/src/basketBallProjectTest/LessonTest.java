package basketBallProjectTest;

import static org.junit.Assert.*;

import org.json.JSONObject;
import org.junit.Test;

import basketballProject.Lesson;

public class LessonTest {
	
	Lesson testLesson = new Lesson("Shooting", 1, 1, 1);
	
	@Test
	public void testGetID(){
		assertEquals("not same", testLesson.getID(), 1);
	}
	@Test
	public void testGetTitle(){
		assertEquals("not same", testLesson.getTitle(), "Shooting");
	}
	@Test
	public void testGetRule(){
		assertEquals("not same", testLesson.getRule(), 1);
	}
	@Test
	public void testGetPlay(){
		assertEquals("not same", testLesson.getPlay(),1);
	}
	@Test
	public void testGetVideo(){
		assertEquals("not same", testLesson.getVideo(),1);
	}
	@Test
	public void testGetAchievementID() {
		assertEquals("not same", testLesson.getAchievementID(),1);
	}
	@Test
	public void TesttoJson() {
		JSONObject jsonObj = new JSONObject();
		jsonObj = testLesson.toJson();
		assertEquals("not same",testLesson.toJson(), jsonObj);
	}
	
	
}
