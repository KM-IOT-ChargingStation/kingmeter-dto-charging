package com.kingmeter.dto.charging.v1.rest.business;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SwipeCardPermissionBSDto {
    private int ast;
    private int acm;
    private int minbsoc;
    private String userId;
}
