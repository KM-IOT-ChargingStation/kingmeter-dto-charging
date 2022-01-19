package com.kingmeter.dto.charging.v1.rest.response;


import com.kingmeter.dto.charging.v1.rest.response.vo.DockStateInfoFromQueryDockInfoVOForRest;
import lombok.Data;

import java.util.List;

/**
 * 站点查询实体bean
 */
@Data
public class SiteInfoOutAllDto {

    private SiteInfoOutDto siteInfo;//站点详情
    private List<DockStateInfoFromQueryDockInfoVOForRest> pileList;//该站点下所有桩体信息列表

    public SiteInfoOutAllDto() {
    }


}
