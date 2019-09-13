package com.kaltura.models.login.request;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class ExtraParams {
    @SerializedName("item")
    public Map<String,Item> items = new HashMap<>();
}
