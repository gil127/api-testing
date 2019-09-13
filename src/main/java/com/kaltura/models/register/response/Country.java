package com.kaltura.models.register.response;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Country {
    @SerializedName("objectType")
    private String objectType;
    @SerializedName("code")
    private String code;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
}
