package com.kaltura;

import com.kaltura.clients.KalturaClient;
import com.kaltura.clients.UrlManager;
import com.kaltura.dataprovider.UserFactory;
import com.kaltura.models.common.OttUser;
import com.kaltura.models.common.error.KalturaHttpErrorReporter;
import com.kaltura.models.register.request.RegisterRequest;
import com.kaltura.models.register.response.RegisterResponse;
import com.kaltura.utils.RandomData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OttRegisterTests {

    private String userName;

    @Before
    public void setUp() {
        userName = RandomData.getString(8);
    }

    @Test
    public void registerValidOttUser() {
        userName = RandomData.getString(8);
        OttUser user = UserFactory.getPositiveFullDataUser(userName);
        RegisterRequest registerRequest = RegisterRequest.builder().user(user).password("password").partnerId(185).build();
        RegisterResponse register = KalturaClient.register(registerRequest);
        Assert.assertEquals(register.getResult().getUsername(), userName);
        Assert.assertEquals(register.getResult().getExternalId(), "185");
    }

    @Test
    public void registerOttUserWithMissingPassword() {
        OttUser user = UserFactory.getPositiveFullDataUser(userName);
        RegisterRequest registerRequest = RegisterRequest.builder().user(user).build();
        KalturaHttpErrorReporter kalturaHttpErrorReporter = KalturaClient.sendNegtiveParamsInTheRequest(registerRequest, UrlManager.REGISTER_URL);
        Assert.assertNotEquals(kalturaHttpErrorReporter.getResult().getError().getCode(), 200);
    }
}
