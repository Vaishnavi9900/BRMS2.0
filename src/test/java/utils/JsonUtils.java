package utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils
	{
		
		   public static List<Map<String, String>> getTestData(String path) throws IOException {
		        ObjectMapper mapper = new ObjectMapper();
		        return mapper.readValue(new File("C:\\Users\\Vaishnavi.T\\eclipse-workspace\\BRMS2.0\\testdata.json"), List.class);
		    }

	}
