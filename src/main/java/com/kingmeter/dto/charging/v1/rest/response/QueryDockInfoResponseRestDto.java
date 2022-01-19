package com.kingmeter.dto.charging.v1.rest.response;

import com.kingmeter.dto.charging.v1.rest.response.vo.DockStateInfoFromQueryDockInfoVOForRest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryDockInfoResponseRestDto {
    private long siteId;//站点id
    private String userId;//用户id

    private DockStateInfoFromQueryDockInfoVOForRest[] state;//车桩信息数组
}
