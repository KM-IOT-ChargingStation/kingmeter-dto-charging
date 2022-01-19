package com.kingmeter.dto.charging.v1.rest.response;


import lombok.Data;

import java.util.Date;

/**
 * 站点查询实体bean
 */
@Data
public class SiteInfoOutDto {
    private long id;//站点编号,唯一id
    private double longitude;//经度
    private double latitude;//纬度
    private int siteType;//1，表示单车桩的站点；2，表示助力充电桩的站点，默认为2
    private String setUpUserName;//建站人员名称
    private String siteName;//站点名称
    private String siteAddress;//站点地址
    private int pileCount;//桩体数，这个和
    private int isSolarEnergy;//是否是太阳能，0不是，1是，默认为0
    private int status;//状态，正常为0，1为管理员主动关闭，2为故障
    private int isOnline;//是否在线，1在线，0是离线
    private int minbatSoc;//允许该站点开桩时，该站点下对应的车辆使用的最低电量
    private String description;//描述

    private int unusedDays;//页面占位符
    private String companyCode;//公司code，用户只属于一个公司
    private String companyName;//公司名称,只是拿来显示用

    private int bikeCount;

    private Date latestUsedTime;//最新使用时间，包括租车，还车都会更新此时间

    /**
     * 最新掉线时间，如果掉线，会更新此时间，
     * 数据库定时任务，如果站点掉线超过7天，自动删除该站点以及该站点下的所有桩体
     */
    private Date latestOfflineTime;

    private Date createDate;//创建时间

}
