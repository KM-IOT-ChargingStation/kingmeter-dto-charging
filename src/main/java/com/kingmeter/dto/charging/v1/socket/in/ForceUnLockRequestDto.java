package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

@Data
public class ForceUnLockRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private int gbs;//取车结果
    private long tim;//时间戳
    private String uid;//用户id
}
