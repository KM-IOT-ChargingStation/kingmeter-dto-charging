package com.kingmeter.dto.charging.v2.socket.in;

import lombok.Data;


@Data
public class BikeInDockRequestDto {
    private long sid;
    private long kid;//dock id
    private long bid;//bike id
    private long tim;//timestamp when the bike is pushed into the dock
}
