package com.kingmeter.dto.charging.v1.rest.request;


import lombok.Data;

@Data
public class ForceUnlockRequestRestDto {
    private long siteId;
    private long dockId;
    private String userId;
}
