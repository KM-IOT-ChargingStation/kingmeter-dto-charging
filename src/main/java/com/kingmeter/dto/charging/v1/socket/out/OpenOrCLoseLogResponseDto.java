package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */
@AllArgsConstructor
@Data
public class OpenOrCLoseLogResponseDto {
    private long sid;
    private int flag;//0,关闭；1，开启
}
