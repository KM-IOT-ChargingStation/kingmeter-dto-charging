package com.kingmeter.dto.charging.v1.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: crazyandy
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryVersionOfComponentsResponseRestDto {
    private String site_comm_token;
    private int return_result;//1,成功
    private int knee_loc;//如果是wifimaster,这个为0
    private long device_id;
    /**
     * 1, wifimaster
     * 2, ICPU
     * 3, Display
     * 4, EICC
     * 5, Font
     * 6, PCRD
     */
    private int update_dev;
    private String soft_version;//e.x. SF170921
    private String hard_version;// HD170921
}
