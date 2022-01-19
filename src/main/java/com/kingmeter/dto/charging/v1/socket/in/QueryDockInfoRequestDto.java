package com.kingmeter.dto.charging.v1.socket.in;

import com.kingmeter.dto.charging.v1.socket.in.vo.DockStateInfoFromQueryDockInfoVO;
import lombok.Data;

@Data
public class QueryDockInfoRequestDto {
    private long sid;//站点id
    private String uid;//用户编号
    private DockStateInfoFromQueryDockInfoVO[] state;//车桩信息数组
}
