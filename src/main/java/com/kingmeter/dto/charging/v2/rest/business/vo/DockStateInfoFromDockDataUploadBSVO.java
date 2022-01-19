package com.kingmeter.dto.charging.v2.rest.business.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateInfoFromDockDataUploadBSVO {
    private long dockId;
    private int dockKln;
    private long bikeId;
    private float chgv;
    private float chgi;
    private int bsoc;
    private int brang;
    private float ipow;
    private float itemp;
}
