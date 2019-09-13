package com.kaltura.models.login.request;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    @SerializedName("objectType")
    private String objectType;
    @SerializedName("description")
    private String description;
    @SerializedName("value")
    private String value;
}
