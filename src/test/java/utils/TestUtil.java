package utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class TestUtil {

	 //Verify the http response status returned. Check Status Code is 200?
    public void checkStatusIs200(Response res) {
        Assert.assertEquals(res.getStatusCode(), 200, "Status Check Failed!");
    }
    //Get Clients
    public <T> ArrayList<T> getClients(JsonPath jp) {
        return jp.get();
    }
	
    public LinkedHashMap<Object, Object> getClients1(JsonPath jp) {
    	LinkedHashMap<Object, Object> map = jp.get();
    	for (Object o : map.keySet()) {
			System.out.println(o+" -> "+map.get(o));
		}
        return map;
    }
}
