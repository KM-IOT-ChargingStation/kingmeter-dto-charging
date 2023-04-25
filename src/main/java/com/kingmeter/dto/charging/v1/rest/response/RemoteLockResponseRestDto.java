package com.kingmeter.dto.charging.v1.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class RemoteLockResponseRestDto {
    private long siteId;
    private long dockId;
    private long bikeId;

    private int bikeState;
    private int lockState;

    private long unlockTimeStamp;
}
