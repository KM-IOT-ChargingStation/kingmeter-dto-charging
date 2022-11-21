package com.kingmeter.dto.charging.v1.rest.response;

import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */
@Data
public class RestartSiteResponseRestDto {
    private String site_comm_token;
    private long site_id;
    private int return_result;
}
