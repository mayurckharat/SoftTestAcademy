package test;

import org.testng.annotations.Test;

public class APITest1 extends BaseTest{

	 @Test
	    public void T01_StatusCodeAndGetClientsTest() {
	        //res = utils.RestAssuredUtil.getResponse("/gen/clients");
		 	res = utils.RestAssuredUtil.getResponse("/users?page=2");
	        testUtil.checkStatusIs200(res);
	        jp = utils.RestAssuredUtil.getJsonPath(res);
	        //System.out.println(testUtil.getClients(jp));
	        //System.out.println(res.asString());
	        testUtil.getClients1(jp);
	    }
	    @Test
	    public void T02_GetAndroidModelPackageOptions() {
	        res = utils.RestAssuredUtil.getResponse("/gen/clients/android");
	        testUtil.checkStatusIs200(res);
	        jp = utils.RestAssuredUtil.getJsonPath(res);
	        System.out.println("Opt: " + jp.get("modelPackage.opt"));
	        System.out.println("Description: " + jp.get("modelPackage.description"));
	        System.out.println("Type: " + jp.get("modelPackage.type"));
	    }
	
}
