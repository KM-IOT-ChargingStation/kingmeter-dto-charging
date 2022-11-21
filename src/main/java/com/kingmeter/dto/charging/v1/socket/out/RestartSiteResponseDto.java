package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */

@AllArgsConstructor
@Data
public class RestartSiteResponseDto {
    private long site_id;
}
