package com.kaltura;

import com.kaltura.clients.KalturaClient;
import com.kaltura.clients.UrlManager;
import com.kaltura.models.common.error.KalturaHttpErrorReporter;
import com.kaltura.models.login.request.LoginRequest;
import com.kaltura.models.login.response.LoginResponse;
import org.junit.Assert;
import org.junit.Test;

public class OttUserLoginTests {

    @Test
    public void registeredOttUserLogin() {
        LoginRequest loginRequest = LoginRequest.builder().username("xympdpkyymlh1537875168491").password("password").build();
        LoginResponse loginResponse = KalturaClient.login(loginRequest);
        Assert.assertNotNull(loginResponse.getLoginSession().getKs());
    }

    @Test
    public void nonAuthurizedUserLogin() {
        LoginRequest loginRequest = LoginRequest.builder().username("gild").password("bla-bla").build();
        KalturaHttpErrorReporter errorReporter = KalturaClient.sendNegtiveParamsInTheRequest(loginRequest, UrlManager.LOGIN_URL);
        Assert.assertNotEquals(errorReporter.getResult().getError().getCode(), 200);
    }
}
