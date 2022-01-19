package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;



@Data
public class BikeInDockRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private long stm;//车辆入桩的时间戳
}
