package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

@Data
public class QueryDockLockStatusRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private String uid;//用户编号
    private int lks;//0正常，1失败
}
