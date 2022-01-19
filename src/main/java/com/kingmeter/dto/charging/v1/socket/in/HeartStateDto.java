package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

@Data
public class HeartStateDto {
    private int kln;
    private long kid;//车桩id
    private long bid;//车辆id
    private int bsoc;//车辆电量
}
