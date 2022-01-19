package com.kingmeter.dto.charging.v1.rest.business;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class QueryLoginPermissionBSDto {
    private long siteId;
    private String msv;
    private String mhv;
}
