package com.kingmeter.dto.charging.v2.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class SiteSettingResponseRestDto {
    private long siteId;
    private int sls;
}
