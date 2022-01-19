package com.kingmeter.dto.charging.v2.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DockMalfunctionUploadRequestDto {
    private long sid;//site id
    private int kln;//
    private long kid;
    private long bid;
    private int cer;//controller malfunction code
    private int ber;//battery malfunction code
    private int disp;//display malfunction code
    private int per;//dock malfunction code
    private int perlk;//dock lock malfunction code
    private int perws;//carrier malfunction code
}
