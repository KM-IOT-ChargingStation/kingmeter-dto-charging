package com.kingmeter.dto.charging.v2.rest.request;

import lombok.Data;


@Data
public class SwingCardUnLockRequestRestDto {
    private long siteId;
    private long dockId;//
    private long vehicleId;//
    private String card;//
    private long tim;
}
