package com.kingmeter.dto.charging.v1.rest.business;


import com.kingmeter.dto.charging.v1.rest.business.vo.DockStateInfoFromDockDataUploadBSVO;
import lombok.Data;

@Data
public class DockDataUploadBSDto {
    private long siteId;
    private DockStateInfoFromDockDataUploadBSVO[] dockArray;
}
