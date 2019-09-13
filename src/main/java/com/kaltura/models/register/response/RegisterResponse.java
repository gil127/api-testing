package com.kaltura.models.register.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RegisterResponse {
    @SerializedName("executionTime")
    private Double executionTime;
    @SerializedName("result")
    private Result result;
}
