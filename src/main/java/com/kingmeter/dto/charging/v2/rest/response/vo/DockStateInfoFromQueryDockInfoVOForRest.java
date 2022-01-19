package com.kingmeter.dto.charging.v2.rest.response.vo;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class DockStateInfoFromQueryDockInfoVOForRest {

    private long dockId;//id of dock
    private int dockKln;//sort of dock

    private String psv;//
    private String phv;//

    private String dsv;//
    private String dhv;//
    private String esv;//
    private String ehv;//

    private int sls;
}
