package com.kingmeter.dto.charging.v1.rest.response;


import lombok.Data;

/**
 * 周围站点查询实体bean
 */
@Data
public class AroundSiteInfoOutDto {
    private long id;//站点编号,唯一id
    private String longitude;//经度
    private String latitude;//纬度
    private int siteType;//1，表示单车桩的站点；2，表示助力充电桩的站点，默认为2
    private int pileCount;//桩体数，这个和
    private int status;//状态，正常为0，异常为1，2为管理员主动关闭

    private int bikeCount;

}
