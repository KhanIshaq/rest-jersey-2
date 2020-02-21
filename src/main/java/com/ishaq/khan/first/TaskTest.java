/**
 * 
 */
package com.ishaq.khan.first;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

/**
 * @author nsa
 *
 */
public class TaskTest {

	public static void main(String[] args) {
		
		ClientConfig config = new ClientConfig();
		
		Client client = ClientBuilder.newClient(config);
		
		WebTarget target = client.target(getBaseURI());
		
		String xmlResponse = target.path("rest")
				.path("task")
				.request()
				.accept(MediaType.TEXT_XML)
				.get(String.class)
				.toString();
		
		String jsonResponse = target.path("rest")
				.path("task")
				.request()
				.accept(MediaType.APPLICATION_JSON)
				.get(String.class)
				.toString();
		
		String appXmlResponse = target.path("rest")
				.path("task")
				.request()
				.accept(MediaType.APPLICATION_XML)
				.get(String.class)
				.toString();
		
		System.out.println(xmlResponse);
		System.out.println(jsonResponse);
		System.out.println(appXmlResponse);
	}
	
	private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost:8080/rest-jersey-2").build();
    }
}
