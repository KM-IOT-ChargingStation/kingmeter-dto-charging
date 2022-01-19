package com.kingmeter.dto.charging.v2.rest.business;


import lombok.Data;

@Data
public class SwipeCardConfirmBSDto {
    private String card;
    private long siteId;
    private long dockId;
    private long bikeId;
    private String userId;
    private int sls;
    private long currentTime;
}
