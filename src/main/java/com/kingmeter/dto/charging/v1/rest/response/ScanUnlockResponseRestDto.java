package com.kingmeter.dto.charging.v1.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class ScanUnlockResponseRestDto {
    private long siteId;
    private long dockId;
    private long bikeId;

    private String userId;
    private int sls;

    private long unlockTimeStamp;
}
