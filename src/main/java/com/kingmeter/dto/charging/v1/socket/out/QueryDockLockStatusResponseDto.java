package com.kingmeter.dto.charging.v1.socket.out;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class QueryDockLockStatusResponseDto {

    private long kid;
    private String uid;

}
