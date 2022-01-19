package com.kingmeter.dto.charging.v1.socket.in.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateInfoFromQueryDockInfoVO {

    private int kln;//sort of dock
    private long kid;//id of dock

    private long bid;
}
