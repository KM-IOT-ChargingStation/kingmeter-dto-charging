package com.kingmeter.dto.charging.v2.socket.in;

import com.kingmeter.dto.charging.v2.socket.in.vo.DockStateInfoFromQueryDockInfoVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryDockInfoRequestDto {
    private long sid;//site id
    private String msv;//software version of wifimaster
    private String mhv;//hardware version of wifimaster
    private String rsv;//
    private String rhv;//

    private DockStateInfoFromQueryDockInfoVO[] state;//dock info

}
