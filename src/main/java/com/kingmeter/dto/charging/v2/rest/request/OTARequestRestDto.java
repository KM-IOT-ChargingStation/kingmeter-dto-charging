package com.kingmeter.dto.charging.v2.rest.request;


import lombok.Data;

@Data
public class OTARequestRestDto {

    private String type;
    private long siteId;
    private String version;
    private String fileName;
    private String fileUrl;
    private int httpPort;

}
