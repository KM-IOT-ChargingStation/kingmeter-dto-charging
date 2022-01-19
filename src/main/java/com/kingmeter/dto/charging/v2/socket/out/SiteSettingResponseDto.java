package com.kingmeter.dto.charging.v2.socket.out;


import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class SiteSettingResponseDto {
    private int heart;
    private int emptyheart;
    private int rptim;
    private int beep;
    private int monitor;
}
