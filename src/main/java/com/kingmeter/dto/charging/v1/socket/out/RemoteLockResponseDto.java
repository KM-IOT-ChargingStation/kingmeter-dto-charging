package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 扫码开桩取车，服务器端发送给站点的数据
 * 其实在这里应该写request
 * 但是我们统一在代码中
 * 1，站点请求过来的都是request
 * 2，服务器请求的都算response
 */
@AllArgsConstructor
@Data
public class RemoteLockResponseDto {
    private long kid;//车桩id
}
