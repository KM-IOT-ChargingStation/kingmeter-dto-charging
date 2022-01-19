package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SwingCardUnLockConfirmResponseDto {
    private long kid;//
    private long tim;//
    private int sls;//
}
