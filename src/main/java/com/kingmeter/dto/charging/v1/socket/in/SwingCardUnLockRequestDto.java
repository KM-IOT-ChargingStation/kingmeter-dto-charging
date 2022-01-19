package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

@Data
public class SwingCardUnLockRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private long cid;//卡id
}
