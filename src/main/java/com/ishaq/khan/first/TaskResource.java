package com.ishaq.khan.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/task")
public class TaskResource {

	//If Application XML is requested from the browser
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public Task getXml() {
		Task task = new Task();
		task.setDescription("Application XML Task Description");
		task.setSummary("Application XML Task Summary");
		return task;
	}
	
	//If JSON is requested
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Task getJSON() {
		Task task = new Task();
		task.setDescription("Application JSON Task Description");
		task.setSummary("Application JSON Task Summary");
		return task;
	}

	//If XML is requested 
	@GET
	@Produces(MediaType.TEXT_XML)
	public Task getHTML() {
		Task task = new Task();
		task.setDescription("Text XML Task Description");
		task.setSummary("Text XML Task Summary");
		return task;
	}
}
