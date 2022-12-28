package com.kingmeter.dto.charging.v1.rest.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: crazyandy
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryLogRequestRestDto {
    private long siteId;
    private List<Map<String,String>> result;
}
