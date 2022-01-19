package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DockMalfunctionUploadResponseDto {
    private long kid;//执行结果
    private int sls;//执行结果
}
