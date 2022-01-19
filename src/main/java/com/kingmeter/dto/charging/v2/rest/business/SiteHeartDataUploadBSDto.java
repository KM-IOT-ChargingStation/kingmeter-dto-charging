package com.kingmeter.dto.charging.v2.rest.business;

import com.kingmeter.dto.charging.v2.rest.business.vo.DockStateInfoFromHeartBeatDataUploadBSVO;
import lombok.Data;

@Data
public class SiteHeartDataUploadBSDto {
    private long siteId;//
    private int rpow;
    private DockStateInfoFromHeartBeatDataUploadBSVO[] dockArray;
}
