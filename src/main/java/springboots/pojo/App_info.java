package springboots.pojo;

import java.util.Date;

/**
 * @Description:App具体信息实体类
 * @Date Created in 11:46   2018/4/25
 */
public class App_info {



    private Integer id;// bigint(30) NOT NULL主键id
    private String  softwareName;// varchar(50) NULL软件名称
    private String  APKName;// varchar(50) NULLAPK名称（唯一）
    private String  supportROM;// varchar(50) NULL支持ROM
    private String  interfaceLanguage;// varchar(50) NULL界面语言
    private float  softwareSize;// decimal(20,2) NULL软件大小（单位：M）
    private Date  updateDate;// date NULL更新日期
    private Integer  devId;// bigint(30) NULL开发者id（来源于：dev_user表的开发者id）
    private String  appInfo;// varchar(5000) NULL应用简介
    private Integer  status;// bigint(30) NULL状态（来源于：data_dictionary，1 待审核 2 审核通过 3 审核不通过 4 已上架 5 已下架）
    private Date  onSaleDate;// datetime NULL上架时间
    private Date  offSaleDate;// datetime NULL下架时间
    private Integer  flatformId;// bigint(30) NULL所属平台（来源于：data_dictionary，1 手机 2 平板 3 通用）
    private Integer  categoryLevel3;// bigint(30) NULL所属三级分类（来源于：data_dictionary）
    private Integer  downloads;// bigint(30) NULL下载量（单位：次）
    private Integer  createdBy;// bigint(30) NULL创建者（来源于dev_user开发者信息表的用户id）
    private Date  creationDate;// datetime NULL创建时间
    private Integer  modifyBy;// bigint(30) NULL更新者（来源于dev_user开发者信息表的用户id）
    private Date  modifyDate;// datetime NULL最新更新时间
    private Integer  categoryLevel1;// bigint(30) NULL所属一级分类（来源于：data_dictionary）
    private Integer  categoryLevel2;// bigint(30) NULL所属二级分类（来源于：data_dictionary）
    private String  logoPicPath;// varchar(500) NULLLOGO图片url路径
    private String  logoLocPath;// varchar(500) NULLLOGO图片的服务器存储路径
    private Integer  versionId;// bigint(30) NULL最新的版本id

    public App_info(){}
    public App_info(Integer id, String softwareName, String APKName, String supportROM, String interfaceLanguage, float softwareSize, Date updateDate, Integer devId, String appInfo, Integer status, Date onSaleDate, Date offSaleDate, Integer flatformId, Integer categoryLevel3, Integer downloads, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate, Integer categoryLevel1, Integer categoryLevel2, String logoPicPath, String logoLocPath, Integer versionId) {
        this.id = id;
        this.softwareName = softwareName;
        this.APKName = APKName;
        this.supportROM = supportROM;
        this.interfaceLanguage = interfaceLanguage;
        this.softwareSize = softwareSize;
        this.updateDate = updateDate;
        this.devId = devId;
        this.appInfo = appInfo;
        this.status = status;
        this.onSaleDate = onSaleDate;
        this.offSaleDate = offSaleDate;
        this.flatformId = flatformId;
        this.categoryLevel3 = categoryLevel3;
        this.downloads = downloads;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.categoryLevel1 = categoryLevel1;
        this.categoryLevel2 = categoryLevel2;
        this.logoPicPath = logoPicPath;
        this.logoLocPath = logoLocPath;
        this.versionId = versionId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getAPKName() {
        return APKName;
    }

    public void setAPKName(String APKName) {
        this.APKName = APKName;
    }

    public String getSupportROM() {
        return supportROM;
    }

    public void setSupportROM(String supportROM) {
        this.supportROM = supportROM;
    }

    public String getInterfaceLanguage() {
        return interfaceLanguage;
    }

    public void setInterfaceLanguage(String interfaceLanguage) {
        this.interfaceLanguage = interfaceLanguage;
    }

    public float getSoftwareSize() {
        return softwareSize;
    }

    public void setSoftwareSize(float softwareSize) {
        this.softwareSize = softwareSize;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getDevId() {
        return devId;
    }

    public void setDevId(Integer devId) {
        this.devId = devId;
    }

    public String getAppInfo() {
        return appInfo;
    }

    public void setAppInfo(String appInfo) {
        this.appInfo = appInfo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOnSaleDate() {
        return onSaleDate;
    }

    public void setOnSaleDate(Date onSaleDate) {
        this.onSaleDate = onSaleDate;
    }

    public Date getOffSaleDate() {
        return offSaleDate;
    }

    public void setOffSaleDate(Date offSaleDate) {
        this.offSaleDate = offSaleDate;
    }

    public Integer getFlatformId() {
        return flatformId;
    }

    public void setFlatformId(Integer flatformId) {
        this.flatformId = flatformId;
    }

    public Integer getCategoryLevel3() {
        return categoryLevel3;
    }

    public void setCategoryLevel3(Integer categoryLevel3) {
        this.categoryLevel3 = categoryLevel3;
    }

    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getCategoryLevel1() {
        return categoryLevel1;
    }

    public void setCategoryLevel1(Integer categoryLevel1) {
        this.categoryLevel1 = categoryLevel1;
    }

    public Integer getCategoryLevel2() {
        return categoryLevel2;
    }

    public void setCategoryLevel2(Integer categoryLevel2) {
        this.categoryLevel2 = categoryLevel2;
    }

    public String getLogoPicPath() {
        return logoPicPath;
    }

    public void setLogoPicPath(String logoPicPath) {
        this.logoPicPath = logoPicPath;
    }

    public String getLogoLocPath() {
        return logoLocPath;
    }

    public void setLogoLocPath(String logoLocPath) {
        this.logoLocPath = logoLocPath;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }

    @Override
    public String toString() {
        return "App_info{" +
                "id=" + id +
                ", softwareName='" + softwareName + '\'' +
                ", APKName='" + APKName + '\'' +
                ", supportROM='" + supportROM + '\'' +
                ", interfaceLanguage='" + interfaceLanguage + '\'' +
                ", softwareSize=" + softwareSize +
                ", updateDate=" + updateDate +
                ", devId=" + devId +
                ", appInfo='" + appInfo + '\'' +
                ", status=" + status +
                ", onSaleDate=" + onSaleDate +
                ", offSaleDate=" + offSaleDate +
                ", flatformId=" + flatformId +
                ", categoryLevel3=" + categoryLevel3 +
                ", downloads=" + downloads +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", categoryLevel1=" + categoryLevel1 +
                ", categoryLevel2=" + categoryLevel2 +
                ", logoPicPath='" + logoPicPath + '\'' +
                ", logoLocPath='" + logoLocPath + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
