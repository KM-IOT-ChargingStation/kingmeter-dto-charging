package com.kingmeter.dto.charging.v1.rest.response.vo;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class DockStateInfoFromQueryDockInfoVOForRest {

    private long dockId;//id of dock
    private int dockKln;//sort of dock

    private long bikeId;
}
