package com.kingmeter.dto.charging.v1.rest.business.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateInfoFromHeartBeatDataUploadBSVO {
    private long dockId;//车桩ID
    private int dockKln;//车桩位置编号
    private long bikeId;//如果没有车，传0
    private int bsoc;//车辆电池容量0% - 100%
}
