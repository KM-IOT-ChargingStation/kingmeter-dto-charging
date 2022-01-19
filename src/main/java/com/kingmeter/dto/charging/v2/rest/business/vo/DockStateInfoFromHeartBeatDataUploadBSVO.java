package com.kingmeter.dto.charging.v2.rest.business.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateInfoFromHeartBeatDataUploadBSVO {
    private long dockId;//
    private int dockKln;//
    private long bikeId;//
    private int bsoc;//
}
