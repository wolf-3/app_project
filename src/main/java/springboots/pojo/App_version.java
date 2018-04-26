package springboots.pojo;

import java.util.Date;

/**
 * @Description:APP版本信息实体类
 * @Date Created in 11:56   2018/4/25
 */
public class App_version {





    private Integer  id ;//bigint(30) NOT NULL主键id
    private Integer  appId;// bigint(30) NULLappId（来源于：app_info表的主键id）
    private String  versionNo;// varchar(50) NULL版本号
    private String  versionInfo;// varchar(2000) NULL版本介绍
    private Integer  publishStatus;// bigint(30) NULL发布状态（来源于：data_dictionary，1 不发布 2 已发布 3 预发布）
    private String  downloadLink ;//varchar(500) NULL下载链接
    private float  versionSized;// ecimal(20,2) NULL版本大小（单位：M）
    private Integer  createdBy;// bigint(30) NULL创建者（来源于dev_user开发者信息表的用户id）
    private Date creationDate;// datetime NULL创建时间
    private Integer  modifyBy;// bigint(30) NULL更新者（来源于dev_user开发者信息表的用户id）
    private Date  modifyDate;// datetime NULL最新更新时间
    private String  apkLocPath;// varchar(500) NULLapk文件的服务器存储路径
    private String  apkFileName;// varchar(500) NULL上传的apk文件名称

    public App_version(){}
    public App_version(Integer id, Integer appId, String versionNo, String versionInfo, Integer publishStatus, String downloadLink, float versionSized, Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate, String apkLocPath, String apkFileName) {
        this.id = id;
        this.appId = appId;
        this.versionNo = versionNo;
        this.versionInfo = versionInfo;
        this.publishStatus = publishStatus;
        this.downloadLink = downloadLink;
        this.versionSized = versionSized;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyBy = modifyBy;
        this.modifyDate = modifyDate;
        this.apkLocPath = apkLocPath;
        this.apkFileName = apkFileName;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getVersionInfo() {
        return versionInfo;
    }

    public void setVersionInfo(String versionInfo) {
        this.versionInfo = versionInfo;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public float getVersionSized() {
        return versionSized;
    }

    public void setVersionSized(float versionSized) {
        this.versionSized = versionSized;
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

    public String getApkLocPath() {
        return apkLocPath;
    }

    public void setApkLocPath(String apkLocPath) {
        this.apkLocPath = apkLocPath;
    }

    public String getApkFileName() {
        return apkFileName;
    }

    public void setApkFileName(String apkFileName) {
        this.apkFileName = apkFileName;
    }

    @Override
    public String toString() {
        return "App_version{" +
                "id=" + id +
                ", appId=" + appId +
                ", versionNo='" + versionNo + '\'' +
                ", versionInfo='" + versionInfo + '\'' +
                ", publishStatus=" + publishStatus +
                ", downloadLink='" + downloadLink + '\'' +
                ", versionSized=" + versionSized +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyBy=" + modifyBy +
                ", modifyDate=" + modifyDate +
                ", apkLocPath='" + apkLocPath + '\'' +
                ", apkFileName='" + apkFileName + '\'' +
                '}';
    }
}
