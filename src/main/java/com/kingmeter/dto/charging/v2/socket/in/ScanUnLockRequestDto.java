package com.kingmeter.dto.charging.v2.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 这是站点程序通过socket发送过来的
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ScanUnLockRequestDto {
    private long sid;//site id
    private long kid;//dock id
    private long bid;//bike id
    private String uid;//user id
    private int gbs;//result  0:succeed ; 7: timeout; 29: low power of battery of bike;
    private long tim;//timestamp
}
