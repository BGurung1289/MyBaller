package basketBallProjectTest;

import org.json.JSONObject;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import basketballProject.Rule;

public class RuleTest {
	
	Rule testRule = new Rule("Backcourt Violation");
	
	@Test
	public void testGetID(){
		assertEquals("not matching",testRule.getID(),1);
	}
	
	@Test
	public void testRuleName(){
		assertEquals("no match", testRule.ruleName(), "Backcourt Violation");
	}
	
	@Test
	public void TesttoJson() {
		JSONObject obj = new JSONObject();
		obj = testRule.toJson();
		assertEquals("not same", testRule.toJson(), obj);
	}
	
}
