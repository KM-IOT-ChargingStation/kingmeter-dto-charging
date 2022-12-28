package com.kingmeter.dto.charging.v1.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crazyandy
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExchangeBootLoadRequestRestDto {
    private long site_id;
    private int enter_bld;//0,quit ; 1,enter
}
