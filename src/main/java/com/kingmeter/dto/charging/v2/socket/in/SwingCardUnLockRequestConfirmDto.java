package com.kingmeter.dto.charging.v2.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SwingCardUnLockRequestConfirmDto {
    private long sid;
    private long kid;//dock id
    private long bid;//bike id
    private String card;//rfid card number
    private int gbs;//result code

    private String uid;//user id

    private long tim;//timestamp



}
