package com.test.hackathon;

import static org.junit.Assert.assertNotNull;

import org.json.JSONObject;
import org.junit.Test;

public class HealperTest {
	
	public JSONObject getObj(){
		String inputObj="{\"feedBackDesc\":\"2\",\"feedBackGroup\":\"3\",\"feedBackTitle\":\"1\"}";
		return new JSONObject(inputObj);
	}
	
	@Test
	public void isValid_Test() {
		JSONObject feedback= getObj();
		assertNotNull(feedback);
	}
	
	@Test
	public void isValidInput_Test() {
		JSONObject feedback= getObj();
		Healper helper= new Healper();
		boolean isValid=helper.isValid(feedback);		
		assertNotNull(isValid);
	}
	
	@Test
	public void isValidTitle_Test() {
		JSONObject feedback= getObj();		
		assertNotNull(feedback.getString("feedBackTitle"));
	}
	
	@Test
	public void isValidGroup_Test() {
		JSONObject feedback= getObj();		
		assertNotNull(feedback.getString("feedBackDesc"));
	}

	@Test
	public void isValidfeedBackTitle_Test() {
		JSONObject feedback= getObj();		
		assertNotNull(feedback.getString("feedBackDesc"));
	}


}
