package com.kingmeter.dto.charging.v2.socket.in;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ForceUnLockRequestDto {
    private long sid;
    private long kid;
    private long bid;
    private String uid;
    private int gbs;
    private long tim;
}
