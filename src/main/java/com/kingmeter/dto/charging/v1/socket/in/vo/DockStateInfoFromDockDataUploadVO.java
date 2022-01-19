package com.kingmeter.dto.charging.v1.socket.in.vo;

import lombok.Data;

@Data
public class DockStateInfoFromDockDataUploadVO {
    private int kln;
    private long kid;
    private long bid;
    private int chgv;
    private int chgi;
    private int bsoc;
    private int brang;
    private int ipow;
    private int itemp;
}
