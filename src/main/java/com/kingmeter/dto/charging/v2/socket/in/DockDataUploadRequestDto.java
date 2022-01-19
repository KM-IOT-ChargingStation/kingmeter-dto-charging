package com.kingmeter.dto.charging.v2.socket.in;

import com.kingmeter.dto.charging.v2.socket.in.vo.DockStateInfoFromDockDataUploadVO;
import lombok.Data;

@Data
public class DockDataUploadRequestDto {
    private long sid;
    private DockStateInfoFromDockDataUploadVO[] state;
}
