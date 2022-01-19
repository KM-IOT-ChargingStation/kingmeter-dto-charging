package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

/**
 * 站点通过socket登录上传数据解析后dto
 */
@Data
public class SiteLoginRequestDto {
    private long sid;//站点id
    private String pwd;//站点密码
}
