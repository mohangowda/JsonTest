package com.mohan.core;

import java.io.File;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
 
public class JacksonExample {
    public static void main(String[] args) {
 
	//User user = new User();
	ObjectMapper mapper = new ObjectMapper();
 
	try {
 
		//Part-A:
		// disable SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS
		mapper.configure(SerializationConfig.Feature.FAIL_ON_EMPTY_BEANS, false);
		// convert user object to json string, and save to a file
		//mapper.writeValue(new File("/Users/shankara/user.json"), user);
 
		// System.out.println("User: " + user.toString());
		
		// display to console
		//System.out.println(mapper.writeValueAsString(user));
		
		// Part-B:
		// read from file, convert it to user class
		User user = mapper.readValue(new File("/Users/shankara/user.json"), User.class);
		 
		// display to console
		System.out.println(user);
 
	} catch (JsonGenerationException e) {
 
		e.printStackTrace();
 
	} catch (JsonMappingException e) {
 
		e.printStackTrace();
 
	} catch (IOException e) {
 
		e.printStackTrace();
 
	}
 
  }
 
}
