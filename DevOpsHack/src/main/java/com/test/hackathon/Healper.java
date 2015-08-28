package com.test.hackathon;

import org.json.JSONObject;
public class Healper {

	public boolean isValid(JSONObject json) {
		boolean isValid=false;
		// TODO Auto-generated method stub
		if(json!= null ){
			if(json.getString("feedBackTitle")!= null){
				isValid=true;				
			}else if(json.getString("feedBackDesc")!= null){
				isValid=true;				
			}else if(json.getString("feedBackGroup")!= null){
				isValid=true;				
			}
		}
		return isValid;
	}

}
