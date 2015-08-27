package com.test.hackathon.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.test.EmailService;
import com.test.hackathon.jira.Jira;

public class MyServlet extends HttpServlet {
    public void doGet(HttpServletRequest theRequest, HttpServletResponse theResponse) throws IOException
    {
    	PrintWriter pw = theResponse.getWriter();
    	theResponse.setContentType("text/html");
    	try{
            JSONObject json = new JSONObject(theRequest.getParameter("jsonStr"));
            EmailService email= new EmailService();
            email.test();
            Jira jiraInterface = new Jira();
            boolean isUpdated =jiraInterface.updateJira(json);
            System.out.println("json "+json);
            pw.print("User Feedback updated successfully");
            if(isUpdated){
            	pw.print("User Feedback updated successfully");
            }
           
    	}catch (Exception e){
    		pw.print(e);
    		System.out.println("Exception in controler "+e);
    	}
        

        
        

    }
}
