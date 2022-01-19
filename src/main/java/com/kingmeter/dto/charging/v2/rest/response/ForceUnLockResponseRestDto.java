package com.kingmeter.dto.charging.v2.rest.response;


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
    private String userId;
    private int sls;
    private long unlockTimeStamp;
}
