package com.kingmeter.dto.charging.v2.rest.response;

import com.kingmeter.dto.charging.v2.rest.response.vo.DockStateFromQueryDockBikeInfoVOForRest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryDockBikeInfoRequestRestDto {
    private long siteId;
    private DockStateFromQueryDockBikeInfoVOForRest[] dockArray;
}
