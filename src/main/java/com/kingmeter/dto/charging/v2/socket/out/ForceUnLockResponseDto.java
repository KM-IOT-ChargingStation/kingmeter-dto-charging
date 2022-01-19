package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ForceUnLockResponseDto {
    private long kid;
    private String uid;
    private long tim;
}
