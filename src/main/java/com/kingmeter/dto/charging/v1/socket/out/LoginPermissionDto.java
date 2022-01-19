package com.kingmeter.dto.charging.v1.socket.out;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class LoginPermissionDto {
    private LoginResponseDto responseDto;
    private String companyCode;
    private int timezone;
}
