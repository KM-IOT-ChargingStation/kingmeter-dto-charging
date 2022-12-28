package com.kingmeter.dto.charging.v1.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crazyandy
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class QueryVersionOfComponentsRequestRestDto {
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
