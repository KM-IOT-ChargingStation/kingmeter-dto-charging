package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * 站点登录之后，返回给站点sokcet的信息
 */
@AllArgsConstructor
@Data
public class LoginResponseDto {
    private int sls;//登录结果
    private String pwd;//新的密码
    private String url;//重定向的域名（登录结果为4时有值，否则为空[“”]）
    private int pot;//重定向的端口（登录结果为4时有值，否则为0）
    private int knee_num;//站点的车桩数量
    private int bike_num;//站点在桩的车辆数
    private long tim;
}
