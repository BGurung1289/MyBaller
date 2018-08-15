package basketBallProjectTest;

import static org.junit.Assert.*;

import org.junit.Test;

import basketballProject.Achievement;

public class AchievementTest {

	Achievement testAchievement = new Achievement("Ball Handler", 1);
	@Test
	public void testGetTitle() {
		assertEquals("not matched", testAchievement.getTitle(), "Ball Handler");
	}
	@Test
	public void testGetAchievementID() {
		assertEquals("not matching", testAchievement.getAchievementID(), 1);
	}
	
}
