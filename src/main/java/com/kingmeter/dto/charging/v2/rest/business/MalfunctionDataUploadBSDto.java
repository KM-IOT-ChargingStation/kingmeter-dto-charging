package com.kingmeter.dto.charging.v2.rest.business;


import lombok.Data;

@Data
public class MalfunctionDataUploadBSDto {
    private long siteId;//
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
