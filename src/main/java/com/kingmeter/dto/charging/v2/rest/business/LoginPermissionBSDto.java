package com.kingmeter.dto.charging.v2.rest.business;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LoginPermissionBSDto {
    private int sls;
    private String password;
    private String socketDomain;
    private int socketPort;
    private String companyCode;
    private int timezone;
}
