import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtils1
	{
		String path = System.getProperty("user.dir") + "testdata.json";
		
		   public static List<Map<String, String>>getTestData(String path) throws IOException {
		        ObjectMapper mapper = new ObjectMapper();
		        return mapper.readValue(new File(path), List.class);
		    }
		   
	}
