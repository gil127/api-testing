package com.kaltura.models.common;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OttUser {
    @SerializedName("objectType")
    private String objectType;
    @SerializedName("username")
    private String username;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("email")
    private String email;
    @SerializedName("address")
    private String address;
    @SerializedName("city")
    private String city;
    @SerializedName("countryId")
    private Integer countryId;
    @SerializedName("externalId")
    private String externalId;

}

