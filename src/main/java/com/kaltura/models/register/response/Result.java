package com.kaltura.models.register.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Result {
    @SerializedName("objectType")
    private String objectType;
    @SerializedName("firstName")
    private String firstName;
    @SerializedName("id")
    private String id;
    @SerializedName("lastName")
    private String lastName;
    @SerializedName("username")
    private String username;
    @SerializedName("address")
    private String address;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private Country country;
    @SerializedName("countryId")
    private Integer countryId;
    @SerializedName("createDate")
    private Integer createDate;
    @SerializedName("dynamicData")
    private DynamicData dynamicData;
    @SerializedName("email")
    private String email;
    @SerializedName("externalId")
    private String externalId;
    @SerializedName("householdId")
    private Integer householdId;
    @SerializedName("isHouseholdMaster")
    private Boolean isHouseholdMaster;
    @SerializedName("roleIds")
    private String roleIds;
    @SerializedName("suspensionState")
    private String suspensionState;
    @SerializedName("suspentionState")
    private String suspentionState;
    @SerializedName("updateDate")
    private Integer updateDate;
    @SerializedName("userState")
    private String userState;
    @SerializedName("userType")
    private UserType userType;
}
