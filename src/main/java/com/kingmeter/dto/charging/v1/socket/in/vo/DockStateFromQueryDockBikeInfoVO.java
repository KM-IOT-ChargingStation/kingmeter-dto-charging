package com.kingmeter.dto.charging.v1.socket.in.vo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateFromQueryDockBikeInfoVO {
    private long kid;
    private int kln;
    private long bid;
    private int sls;
}
