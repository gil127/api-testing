package com.kaltura.models.register.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserType {
    @SerializedName("objectType")
    private String objectType;
    @SerializedName("description")
    private String description;
}
