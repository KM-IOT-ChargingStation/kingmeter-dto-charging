package com.kingmeter.dto.charging.v1.rest.response;

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
public class ExchangeBootLoadResponseRestDto {
    private String site_comm_token;
    private long site_id;
    private int return_result;//1 成功
}
