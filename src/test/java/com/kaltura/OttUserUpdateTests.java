package com.kaltura;

import com.kaltura.clients.KalturaClient;
import com.kaltura.clients.UrlManager;
import com.kaltura.dataprovider.UserFactory;
import com.kaltura.models.common.OttUser;
import com.kaltura.models.common.error.KalturaHttpErrorReporter;
import com.kaltura.models.update.request.UpdateRequest;
import com.kaltura.utils.RandomData;
import org.junit.Assert;
import org.junit.Test;

public class OttUserUpdateTests {

    @Test
    public void updateCityForValidOttUser() {
        OttUser user = UserFactory.getPositiveFullDataUser(RandomData.getString(8));
        user.setCity("Tel-Aviv");
        UpdateRequest updateRequest = UpdateRequest.builder().user(user).id("185").build();
        OttUser responseUser = KalturaClient.update(updateRequest);
        Assert.assertEquals(responseUser.getCity(), "Tel-Aviv");
    }

    @Test
    public void updateNonExistingUser() {
        UpdateRequest updateRequest = UpdateRequest.builder().id("185").build();
        KalturaHttpErrorReporter errorReporter = KalturaClient.sendNegtiveParamsInTheRequest(updateRequest, UrlManager.UPDATE_URL);
        Assert.assertNotEquals(errorReporter.getResult().getError().getCode(), 200);
    }
}
