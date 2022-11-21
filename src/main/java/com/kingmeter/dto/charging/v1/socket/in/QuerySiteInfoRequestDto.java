package com.kingmeter.dto.charging.v1.socket.in;

import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */

@Data
public class QuerySiteInfoRequestDto {
    private long site_id;
    private String site_comm_token;
    private int return_result;
    private String site_password;
    private String login_ip;
    private int login_port;
    private int reset_count;
    private int succ_count;
    private int fail_count;
    private int knee_mode;
    private int backstage_sel;
    private String net_wifiname;
    private String net_wifipsd;
    private String net_apn;
    private String customer_id;
}
