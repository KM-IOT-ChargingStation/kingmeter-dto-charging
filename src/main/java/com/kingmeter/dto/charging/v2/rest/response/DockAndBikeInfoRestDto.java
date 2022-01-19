package com.kingmeter.dto.charging.v2.rest.response;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@AllArgsConstructor
@Data
public class DockAndBikeInfoRestDto {
    private List<Long> online;
    private List<Long> offline;
}
