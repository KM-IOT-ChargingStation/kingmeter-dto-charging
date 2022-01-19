package com.kingmeter.dto.charging.v2.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DockMalfunctionClearResponseDto {
    private long kid;//
    private int err;//
}
