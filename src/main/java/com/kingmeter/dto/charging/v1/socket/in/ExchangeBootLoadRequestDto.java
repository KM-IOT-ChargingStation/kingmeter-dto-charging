package com.kingmeter.dto.charging.v1.socket.in;

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
public class ExchangeBootLoadRequestDto {
    private String site_comm_token;
    private long site_id;
    private int return_result;//1 成功
}
