package com.kingmeter.dto.charging.v1.rest.request;

import lombok.Data;


@Data
public class ScanUnLockPermissionRequestDto {
    private long pileCode;//桩体编码
    private String platform;//平台编码,web传0,app传1
}
