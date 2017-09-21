package com.ssm.maven.core.utils;

import java.io 

.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSONUtil {
	public static String objectToString(Object user) {
		ObjectMapper mapper = new ObjectMapper();
		String value = null;
		try {
			value = mapper.writeValueAsString(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
}