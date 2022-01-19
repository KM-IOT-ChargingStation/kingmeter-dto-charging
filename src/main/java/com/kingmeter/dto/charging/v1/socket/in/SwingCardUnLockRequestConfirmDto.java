package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

@Data
public class SwingCardUnLockRequestConfirmDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private long cid;//租车卡id
    private int gbs;//取车结果
    private long tim;//时间戳
}
