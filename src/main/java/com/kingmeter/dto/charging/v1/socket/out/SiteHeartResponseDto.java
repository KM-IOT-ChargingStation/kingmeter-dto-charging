package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SiteHeartResponseDto {
    private long tim;//时间戳
    private int bike_num;//在桩车辆数
}
