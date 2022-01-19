package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SiteHeartResponseDto {
    private long tim;//
    private int sls;//
    private int bnum;//
}
