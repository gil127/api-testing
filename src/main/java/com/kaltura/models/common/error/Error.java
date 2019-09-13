package com.kaltura.models.common.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Error {
    @SerializedName("code")
    private String code;
    @SerializedName("message")
    private String message;
    @SerializedName("objectType")
    private String objectType;
}
