package com.kingmeter.dto.charging.v2.socket.in.vo;

import lombok.Data;

@Data
public class DockStateInfoFromHeartBeatVO {
    private int kln;//dock sort number
    private long kid;//dock id
    private long bid;//bike id
    private int bsoc;//capacity of bike's battery 0~100
}
