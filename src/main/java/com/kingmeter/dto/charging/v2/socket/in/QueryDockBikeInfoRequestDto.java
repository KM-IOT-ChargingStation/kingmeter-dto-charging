package com.kingmeter.dto.charging.v2.socket.in;

import com.kingmeter.dto.charging.v2.socket.in.vo.DockStateFromQueryDockBikeInfoVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryDockBikeInfoRequestDto {
    private long sid;
    private DockStateFromQueryDockBikeInfoVO[] state;
}
