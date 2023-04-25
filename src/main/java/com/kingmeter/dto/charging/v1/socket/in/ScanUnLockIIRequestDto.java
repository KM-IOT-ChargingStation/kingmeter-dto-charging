package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

/**
 * 这是站点程序通过socket发送过来的
 */
@Data
public class ScanUnLockIIRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private String uid;//用户编号，这是在扫码租车时发送socket传过去的
    private int bs;//车状态 0无车，1，有车
    private int ls;//锁状态 1开锁，2关锁，3故障
    private long tim;//时间戳
}
