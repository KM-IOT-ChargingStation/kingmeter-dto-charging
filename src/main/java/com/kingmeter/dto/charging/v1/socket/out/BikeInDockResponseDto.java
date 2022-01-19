package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class BikeInDockResponseDto {
    private long kid;//车桩id
    private int ret;//入桩类型
    private int acm;//账户余额
    private int cum;//消费金额
    private int tim;//租车时长
}
