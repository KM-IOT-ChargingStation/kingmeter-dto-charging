package com.kingmeter.dto.charging.v2.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class QueryDockLockStatusResponseRestDto {
    private long siteId;//site id
    private long dockId;//
    private long bikeId;//
    private String userId;//
    private int sls;//
}
