package com.kingmeter.dto.charging.v2.socket.in;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MalfunctionClearRequestDto {
    private long sid;
    private long kid;
    private int sls;
}
