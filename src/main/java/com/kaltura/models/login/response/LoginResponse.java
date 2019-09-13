package com.kaltura.models.login.response;

import com.google.gson.annotations.SerializedName;
import com.kaltura.models.common.OttUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResponse {
    @SerializedName("user")
    private OttUser user;
    @SerializedName("loginSession")
    private LoginSession loginSession;
}
