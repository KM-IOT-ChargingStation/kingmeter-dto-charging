package com.kingmeter.dto.charging.v2.socket.in;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class OTAResultUploadRequestDto {
    private long sid;
    private int parts;
    private long kid;
    private int pro;
    private int sls;
}
