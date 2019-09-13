package com.kaltura.dataprovider;


import com.kaltura.models.common.OttUser;

public class UserFactory {

    private UserFactory() {
        throw new IllegalStateException("Utility class");
    }

    public static OttUser getPositiveFullDataUser(String userName) {
     return OttUser.builder().objectType("KalturaOTTUser").username(userName).
             firstName("xympdpkyymlh").lastName("1537875168491").email("qaott2018+xympdpkyymlh1537875168491@gmail.com").
             address("xympdpkyymlh fake address").city("xympdpkyymlh fake city").countryId(7).externalId("xympdpkyymlh1537875168491")
             .build();
    }
}
