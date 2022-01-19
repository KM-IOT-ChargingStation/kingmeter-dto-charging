package com.kingmeter.dto.charging.v2.socket.in;

import lombok.Data;

@Data
public class QueryDockLockStatusRequestDto {
    private long sid;//site id
    private long kid;//dock id
    private long bid;//bike id
    private String uid;//user id
    private int lks;//0 normal，1 error
}
