package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class OTAResponseDto {
    private String furl;
    private int fpot;
    private String fname;
    private String fver;
    private int parts;
}
