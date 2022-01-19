package com.kingmeter.dto.charging.v2.rest.business;


import com.kingmeter.dto.charging.v2.rest.business.vo.DockStateInfoFromDockDataUploadBSVO;
import lombok.Data;

@Data
public class DockDataUploadBSDto {
    private long siteId;
    private DockStateInfoFromDockDataUploadBSVO[] dockArray;
}
