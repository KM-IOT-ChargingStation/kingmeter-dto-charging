package com.kingmeter.dto.charging.v1.rest.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BikeInDockResponseBSDto {
    private int ret;//入桩返回结果
    private int acm;//账户余额
    private int expense;//消费金额
    private int rtm;//租车时长
}
