package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */
@AllArgsConstructor
@Data
public class QueryVersionOfComponentsResponseDto {
    private long site_id;
    /**
     * 1, wifimaster
     * 2, ICPU
     * 3, Display
     * 4, EICC
     * 5, Font
     * 6, PCRD
     */
    private int update_dev;
}
