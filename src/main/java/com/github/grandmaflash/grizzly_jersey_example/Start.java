package com.github.grandmaflash.grizzly_jersey_example;

import java.net.URI;
import java.io.IOException;

import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;


import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

public class Start {
	public static void main(String[] args) throws IOException {
		URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
		ResourceConfig resourceConfig = new ResourceConfig(RestResource.class);
		HttpServer server = GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
		System.out.println("Press enter to stop the server...");			
		System.in.read();
	}
}
