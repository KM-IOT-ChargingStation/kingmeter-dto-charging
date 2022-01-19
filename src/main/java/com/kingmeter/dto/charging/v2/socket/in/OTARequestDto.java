package com.kingmeter.dto.charging.v2.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OTARequestDto {
    private long sid;
    private int parts;
    private int pnum;
    private int sls;
}
