package com.kingmeter.dto.charging.v1.rest.business;

import com.kingmeter.dto.charging.v1.rest.business.vo.DockStateInfoFromHeartBeatDataUploadBSVO;
import lombok.Data;

@Data
public class SiteHeartDataUploadBSDto {
    private long siteId;//站点id
    private int rpow;
    private DockStateInfoFromHeartBeatDataUploadBSVO[] dockArray;
}
