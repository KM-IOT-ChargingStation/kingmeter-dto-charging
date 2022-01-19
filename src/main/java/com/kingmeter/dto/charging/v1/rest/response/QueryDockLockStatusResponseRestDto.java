package com.kingmeter.dto.charging.v1.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class QueryDockLockStatusResponseRestDto {
    private long siteId;//site id
    private long dockId;//车桩id
    private long bikeId;//车辆id
    private String userId;//用户编号
    private int lks;//0正常，1失败
}
