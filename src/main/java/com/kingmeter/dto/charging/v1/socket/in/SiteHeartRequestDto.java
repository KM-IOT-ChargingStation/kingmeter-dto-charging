package com.kingmeter.dto.charging.v1.socket.in;

import com.kingmeter.dto.charging.v1.socket.in.vo.DockStateInfoFromHeartBeatVO;
import lombok.Data;

@Data
public class SiteHeartRequestDto {
    private long sid;
    private int scf;
    private String sur;
    private String svl;
    private int stu;
    private int soc;
    private DockStateInfoFromHeartBeatVO state[];
}
