/**
 * 
 */
package com.ishaq.khan.first;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * @author nsa
 *
 */
@Path("/welcome")
public class WelcomeResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextWelcome() {
		return "Welcome to Jersey 2";
	}
	
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLWelcome() {
		return "<?xml version=\"1.0\"?>" + "<hello>Welcome to Jersey 2</hello>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlWelcome() {
		return "<html> " + "<title>" + "Welcome Jersey" + "</title>" + "<body><h1>" + "Hello Jersey" + "</h1></body>"
				+ "</html> ";
	}

}
