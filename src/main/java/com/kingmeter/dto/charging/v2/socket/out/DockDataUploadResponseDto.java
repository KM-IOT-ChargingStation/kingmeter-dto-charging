package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DockDataUploadResponseDto {
    private int sls;
    private long tim;
}
