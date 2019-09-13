package com.kaltura.models.common.error;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KalturaHttpErrorReporter {
    @SerializedName("executionTime")
    private Double executionTime;
    @SerializedName("result")
    private Result result;
}
