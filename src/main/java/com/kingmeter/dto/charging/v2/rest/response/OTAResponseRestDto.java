package com.kingmeter.dto.charging.v2.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class OTAResponseRestDto {
    private long siteId;
    private String type;
    private int pnum;
    private int sls;
}
