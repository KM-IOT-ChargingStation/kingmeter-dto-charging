package com.kingmeter.dto.charging.v2.rest.request;


import lombok.Data;

@Data
public class ClearMalfunctionRequestRestDto {
    private long siteId;
    private long dockId;
    private int error;
}
