package com.kingmeter.dto.charging.v1.rest.request;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class ScanUnlockIIRequestRestDto {
    private long siteId;
    private long dockId;
    private String userId;
    private int minbsoc;
    private int timeout;
}
