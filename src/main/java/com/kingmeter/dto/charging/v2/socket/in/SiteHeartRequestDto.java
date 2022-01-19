package com.kingmeter.dto.charging.v2.socket.in;

import com.kingmeter.dto.charging.v2.socket.in.vo.DockStateInfoFromHeartBeatVO;
import lombok.Data;

@Data
public class SiteHeartRequestDto {
    private long sid;//site id
    private int rpow;//

    private DockStateInfoFromHeartBeatVO[] state;

}
