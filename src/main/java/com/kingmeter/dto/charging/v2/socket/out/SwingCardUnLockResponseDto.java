package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SwingCardUnLockResponseDto {
    private long kid;//
    private int ast;//
    private int acm;//
    private int minbsoc;//

    private String uid;//
    private long tim;//
}
