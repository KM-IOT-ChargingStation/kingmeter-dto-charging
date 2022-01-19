package com.kingmeter.dto.charging.v1.rest.request;


import lombok.Data;

/**
 * 站点信息修改实体bean
 */
@Data
public class SiteInfoInDto {
    private long id;//站点编号,唯一id，以9开头的字符串型数字
    private double longitude;//经度
    private double latitude;//纬度
    private int siteType;//1，表示单车桩的站点；2，表示助力充电桩的站点，默认为2
    private String setUpUserName;//建站人员名称
    private String siteName;//站点名称
    private String siteAddress;//站点地址
    private int pileCount;//桩体数，这个和
    private int isSolarEnergy;//是否是太阳能，0不是，1是，默认为0
    private int status;//状态，正常为0，异常为1，2为管理员主动关闭
    private int minbatSoc;//允许该站点开桩时，该站点下对应的车辆使用的最低电量
    private String description;//描述

    private String companyCode;//公司code
    private String companyName;//公司名称

    public SiteInfoInDto(){}

    public SiteInfoInDto(long id, double longitude, double latitude,
                         int siteType, String setUpUserName, String siteName,
                         String siteAddress, int pileCount, int isSolarEnergy,
                         int status, int minbatSoc, String description,
                         String companyCode,String companyName) {
        this.id = id;
        this.longitude = longitude;
        this.latitude = latitude;
        this.siteType = siteType;
        this.setUpUserName = setUpUserName;
        this.siteName = siteName;
        this.siteAddress = siteAddress;
        this.pileCount = pileCount;
        this.isSolarEnergy = isSolarEnergy;
        this.status = status;
        this.minbatSoc = minbatSoc;
        this.description = description;

        this.companyCode = companyCode;
        this.companyName = companyName;
    }
}
