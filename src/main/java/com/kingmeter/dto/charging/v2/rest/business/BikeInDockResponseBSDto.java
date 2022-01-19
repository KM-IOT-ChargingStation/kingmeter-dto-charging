package com.kingmeter.dto.charging.v2.rest.business;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BikeInDockResponseBSDto {
    private int ret;//
    private int acm;//
    private int expense;//
    private int rtm;//
}
