package com.kingmeter.dto.charging.v1.socket.in;

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
public class ClearLogRequestDto {
    private long sid;
    private int sls;
}
