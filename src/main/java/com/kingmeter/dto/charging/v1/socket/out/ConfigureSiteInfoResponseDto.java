package com.kingmeter.dto.charging.v1.socket.out;

import lombok.Data;

/**
 * @description:
 * @author: crazyandy
 */

@Data
public class ConfigureSiteInfoResponseDto {
    private long site_id;
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
    private String customer_id;


    public ConfigureSiteInfoResponseDto(long site_id,
                                        String site_password,
                                        String login_ip,
                                        int login_port,
                                        String net_wifiname,
                                        String net_wifipsd,
                                        String customer_id) {
        this.site_id = site_id;
        this.site_password = site_password;
        this.login_ip = login_ip;
        this.login_port = login_port;
        this.reset_count = 0;
        this.succ_count = 0;
        this.fail_count = 0;
        this.knee_mode = 1;
        this.backstage_sel = 2;
        this.net_wifiname = net_wifiname;
        this.net_wifipsd = net_wifipsd;
        this.customer_id = customer_id;
    }
}
