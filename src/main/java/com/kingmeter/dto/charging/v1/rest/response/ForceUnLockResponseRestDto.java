package com.kingmeter.dto.charging.v1.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ForceUnLockResponseRestDto {
    private long siteId;
    private long dockId;
    private long bikeId;
    private int gbs;
    private long unlockTimeStamp;
}
