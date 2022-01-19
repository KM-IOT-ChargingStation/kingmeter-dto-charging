package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

/**
 * 这是站点程序通过socket发送过来的
 */
@Data
public class ScanUnLockRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private String uid;//用户编号，这是在扫码租车时发送socket传过去的
    private int gbs;//取车结果 0取车成功，7，取车超时
    private long tim;//时间戳
}
