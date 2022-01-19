package com.kingmeter.dto.charging.v2.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SwingCardUnLockRequestDto {
    private long sid;
    private long kid;//dock id
    private long bid;//bike id
    private String card;//rfid card id
    private long tim;//timestamp
}
