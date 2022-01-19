package com.kingmeter.dto.charging.v2.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MalfunctionClearResponseRestDto {
    private long siteId;
    private long dockId;
    private int sls;
}
