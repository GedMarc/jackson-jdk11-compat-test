package com.fasterxml.jackson.compat11.test.misc;

//GedMarc 2020/11/12 - re-enable after merges done with 2.12rc2
/*
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.guicedee.guicedservlets.rest.RESTContext;
import com.guicedee.guicedservlets.undertow.GuicedUndertow;
import com.guicedee.logger.LogFactory;
import io.undertow.Undertow;
import org.junit.jupiter.api.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.logging.Level;

public class RestModuleTest
{

	public static void main(String[] args) throws Exception
	{
		LogFactory.configureConsoleSingleLineOutput(Level.FINE);
		new RestModuleTest().testConfigureServlets();
	}

	@Test
	public void testConfigureServlets() throws Exception
	{
		//Manually adding them in so it doesn't pick up oauth etc, clean jackson provider test
		RESTContext.getProviders()
		           .add(JacksonJaxbJsonProvider.class.getCanonicalName());
		Undertow undertow = GuicedUndertow.boot("0.0.0.0", 6003);
		//Do stuff
		HttpClient client = HttpClient.newBuilder()
		                              .connectTimeout(Duration.of(5, ChronoUnit.SECONDS))
		                              .build();
		HttpResponse<String> response = client.send(HttpRequest.newBuilder()
		                                                       .GET()
		                                                       .uri(new URI("http://localhost:6003/rest/hello/helloObject/world"))
		                                                       .build(),
		                                            HttpResponse.BodyHandlers.ofString());
		System.out.println("Rest Response : " + response.body());
		if (response.statusCode() / 100 != 2 || !response.body()
		                                                 .equals("{\"name\":\"world\"}"))
		{
			throw new Exception("Didn't manage to make a rest servlet");
		}
		undertow.stop();
	}
}*/
