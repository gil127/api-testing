package com.kaltura.models.login.request;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class LoginRequest {
    @SerializedName("partnerId")
    private Integer partnerId = 185;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("extraParams")
    private ExtraParams extraParams;
    @SerializedName("udid")
    private String udid;
}
