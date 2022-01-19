package com.kingmeter.dto.charging.v2.rest.request;


import lombok.Data;

@Data
public class SiteSettingRequestRestDto {
    private long siteId;
    private int dataInterval;
    private int emptyInterval;
    private int repeatTime;
    private int beep;
    private int monitor;
}
