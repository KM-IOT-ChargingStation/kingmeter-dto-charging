package com.kingmeter.dto.charging.v1.socket.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DockMalfunctionUploadRequestDto {
    private long kid;//车桩id
    private long bid;//车辆id
    private int cer;//控制器故障代码
    private int ber;//电池故障代码
    private int perlk;//桩体锁故障
    private int perws;//载波故障
    private int ser;// 太阳能车棚故障
}
