package com.kaltura.models.register.request;

import com.google.gson.annotations.SerializedName;
import com.kaltura.models.common.OttUser;
import lombok.*;


@Getter
@Setter
@Builder
public class RegisterRequest {

    @SerializedName("partnerId")
    private Integer partnerId;
    @SerializedName("user")
    private OttUser user;
    @SerializedName("password")
    private String password;
}