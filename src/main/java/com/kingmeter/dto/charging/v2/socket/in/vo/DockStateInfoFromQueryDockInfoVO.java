package com.kingmeter.dto.charging.v2.socket.in.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class DockStateInfoFromQueryDockInfoVO {

    private int kln;//sort of dock
    private long kid;//id of dock

    private String psv;//version of software of the dock
    private String phv;//version of hardware of the dock

    private String dsv;//version of software of the display
    private String dhv;//version of hardware of the display

    private String esv;//version of software of the carrier from the dock
    private String ehv;//version of hardware of the carrier from the dock

    private int sls;//status , 0:okay, 1,error
}
