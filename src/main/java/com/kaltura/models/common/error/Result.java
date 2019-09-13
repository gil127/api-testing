package com.kaltura.models.common.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {
    @SerializedName("error")
    private Error error;
}
