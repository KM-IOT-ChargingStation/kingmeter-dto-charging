package com.kingmeter.dto.charging.v1.socket.in.vo;

import lombok.Data;

@Data
public class DockStateInfoFromHeartBeatVO {
    private long kid;//车桩ID
    private long bid;//如果没有车，传0
    private int bsoc;//车辆电池容量0% - 100%
    private int kmos;//桩温度
    private int kvin;//桩电压
    private int kcur;//桩电流
}
