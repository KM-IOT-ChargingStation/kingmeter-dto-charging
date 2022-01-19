package com.kingmeter.dto.charging.v2.rest.business;


import lombok.Data;

@Data
public class BikeInDockBSDto {
    private long siteId;
    private long dockId;
    private long bikeId;
    private long currentTime;
}
