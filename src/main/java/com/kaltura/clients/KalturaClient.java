package com.kaltura.clients;

import com.google.gson.JsonObject;
import com.kaltura.models.common.OttUser;
import com.kaltura.models.common.error.KalturaHttpErrorReporter;
import com.kaltura.models.login.request.LoginRequest;
import com.kaltura.models.login.response.LoginResponse;
import com.kaltura.models.register.request.RegisterRequest;
import com.kaltura.models.register.response.RegisterResponse;
import com.kaltura.models.update.request.UpdateRequest;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.json.JSONObject;
import org.junit.Assert;

import static java.net.HttpURLConnection.HTTP_OK;

public class KalturaClient {

    static {
        BasicConfigurator.configure();
    }

    private static final String CONTENT_TYPE = "Content-Type";
    private static final String APPLICATION_JSON = "application/json";

    private static final String URL = "https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3";
    private static final Logger logger = Logger.getLogger(KalturaClient.class);


    public static RegisterResponse register(RegisterRequest registerRequest) {
        logger.info("sending register request");
        RestAssured.baseURI = URL;
        String path = UrlManager.REGISTER_URL;
        RequestSpecification request = RestAssured.given().header(new Header(CONTENT_TYPE, APPLICATION_JSON));
        request.body(new JSONObject(registerRequest).toString());
        Response response = request.post(path);
        Assert.assertEquals(response.getStatusCode(), HTTP_OK);
        return response.getBody().as(RegisterResponse.class);
    }

    public static LoginResponse login(LoginRequest loginRequest) {
        logger.info("sending login request");
        RestAssured.baseURI = URL;
        String path = UrlManager.LOGIN_URL;
        RequestSpecification request = RestAssured.given().header(new Header(CONTENT_TYPE, APPLICATION_JSON));
        request.body(new JSONObject(loginRequest).toString());
        Response response = request.post(path);
        Assert.assertEquals(response.getStatusCode(), HTTP_OK);
        return response.getBody().as(LoginResponse.class);
    }

    public static OttUser update(UpdateRequest updateRequest) {
        logger.info("sending update request");
        RestAssured.baseURI = URL;
        String path = UrlManager.UPDATE_URL;
        RequestSpecification request = RestAssured.given().header(new Header(CONTENT_TYPE, APPLICATION_JSON));
        request.body(new JSONObject(updateRequest).toString());
        Response response = request.post(path);
        Assert.assertEquals(response.getStatusCode(), HTTP_OK);
        return response.getBody().as(OttUser.class);
    }

    public static KalturaHttpErrorReporter sendNegtiveParamsInTheRequest(Object requestBody, String path) {
        logger.info(String.format("sending negtive params in the request, for path: %s", path));
        RestAssured.baseURI = URL;
        RequestSpecification request = RestAssured.given().header(new Header(CONTENT_TYPE, APPLICATION_JSON));
        request.body(new JSONObject(requestBody).toString());
        Response response = request.post(path);
        return response.getBody().as(KalturaHttpErrorReporter.class);
    }
}
