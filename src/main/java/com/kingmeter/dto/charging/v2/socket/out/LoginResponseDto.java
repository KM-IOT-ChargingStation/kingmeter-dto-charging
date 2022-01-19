package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;


/**
 * 站点登录之后，返回给站点sokcet的信息
 */
@AllArgsConstructor
@Data
public class LoginResponseDto {
    private int sls;
    private String pwd;//
    private String url;//
    private int pot;//
    private int knum;//
    private int bnum;//
    private String cid;//customer id , etc. 2113
    private long tim;//timestamp
}
