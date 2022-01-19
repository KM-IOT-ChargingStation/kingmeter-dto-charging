package com.kingmeter.dto.charging.v2.socket.in;

import lombok.Data;

/**
 * 站点通过socket登录上传数据解析后dto
 */
@Data
public class SiteLoginRequestDto {
    private long sid;//site id
    private String pwd;//password
    private String msv;//software version of wifimaster
    private String mhv;//hardware version of wifimaster
}
