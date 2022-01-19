package com.kingmeter.dto.charging.v1.rest.business;


import lombok.Data;

@Data
public class MalfunctionDataUploadBSDto {
    private long siteId;//站点id
    private long dockId;
    private int dockKln;
    private long bikeId;
    private int cer;
    private int ber;
    private int disp;
    private int per;
    private int perlk;
    private int perws;
}
