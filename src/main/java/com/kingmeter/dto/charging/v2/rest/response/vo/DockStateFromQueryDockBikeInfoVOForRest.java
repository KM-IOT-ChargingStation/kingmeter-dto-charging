package com.kingmeter.dto.charging.v2.rest.response.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateFromQueryDockBikeInfoVOForRest {
    private long dockId;
    private int dockKln;
    private long bikeId;
    private int sls;
}
