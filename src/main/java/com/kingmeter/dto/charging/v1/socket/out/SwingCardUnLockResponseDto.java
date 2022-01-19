package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SwingCardUnLockResponseDto {
    private long kid;//车桩id
    private int ast;//账户状态
    private int acm;//账户余额
    private int minbat_soc;//电量表示
}
