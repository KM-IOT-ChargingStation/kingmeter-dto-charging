package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */
@Data
public class ConfigureSiteInfoRequestDto {
    private String site_comm_token;
    private long site_id;
    private int return_result;
}
