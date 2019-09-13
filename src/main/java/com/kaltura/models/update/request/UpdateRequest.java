package com.kaltura.models.update.request;

import com.google.gson.annotations.SerializedName;
import com.kaltura.models.common.OttUser;
import com.kaltura.models.login.request.ExtraParams;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UpdateRequest {
    @SerializedName("user")
    private OttUser user;
    @SerializedName("id")
    private String id;
}