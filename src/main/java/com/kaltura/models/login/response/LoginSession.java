package com.kaltura.models.login.response;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginSession {
    @SerializedName("ks")
    private String ks;
}
