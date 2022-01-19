package com.kingmeter.dto.charging.v2.rest.response;

import com.kingmeter.dto.charging.v2.rest.response.vo.DockStateInfoFromQueryDockInfoVOForRest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryDockInfoResponseRestDto {
    private long siteId;//
    private String msv;//
    private String mhv;//
    private String rsv;//
    private String rhv;//

    private DockStateInfoFromQueryDockInfoVOForRest[] state;//车桩信息数组
}
