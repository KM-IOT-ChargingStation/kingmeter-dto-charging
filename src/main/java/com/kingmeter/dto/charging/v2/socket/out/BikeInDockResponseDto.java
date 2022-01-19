package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BikeInDockResponseDto {
    private long kid;//dock id
    private int ret;//
    private int acm;//account balance
    private int cum;//
    private int rtm;//
}
